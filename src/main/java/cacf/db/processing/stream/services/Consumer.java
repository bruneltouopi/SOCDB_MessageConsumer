package cacf.db.processing.stream.services;

import cacf.db.processing.stream.message.input.MessageCdc;
import cacf.db.processing.stream.utils.Constants;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

import java.util.Random;

/**
 * This class read Message from the Topics and format it
 */
public class Consumer {
    public void ConsumeMesaage() throws IOException {
        // set up house-keeping
        ObjectMapper mapper = new ObjectMapper();

        // the consumer
        KafkaConsumer<String, String> consumer;
        //load properties from file
        try (InputStream props = Resources.getResource("consumer").openStream()) {
            Properties properties = new Properties();
            properties.load(props);
            if (properties.getProperty("group.id") == null) {
                properties.setProperty("group.id", "group-" + new Random().nextInt(100000));
            }

            consumer = new KafkaConsumer<>(properties);
        }
        //regiter the topics to the consumer
        consumer.subscribe(Arrays.asList(Constants.TOPIC_API, Constants.TOPIC_CDC));
        int timeouts = 0;
        //noinspection InfiniteLoopStatement
        while (true) {

            ConsumerRecords<String, String> records = consumer.poll(200);

            for (ConsumerRecord<String, String> record : records) {
                switch (record.topic()) {
                    //TODO: Format the  Message and define time of Channel
                    case Constants.TOPIC_API:
                        // the send time is encoded inside the message
                        JsonNode msg = mapper.readTree(record.value());
                       //TODO: call Producer depend of the source in the read in message
                        switch (msg.get("type").asText()) {
                            case "test":

                                break;
                            case "marker":

                                break;
                            default:
                                throw new IllegalArgumentException("Illegal message type: " + msg.get("type"));
                        }
                        break;
                    case Constants.TOPIC_CDC:
                        //convert message cdc Message
                        MessageCdc messageCdc = mapper.readValue(record.value(), MessageCdc.class);
                        //TODO: convert to Pivot Message


                        break;
                    default:
                        throw new IllegalStateException("Shouldn't be possible to get message on topic " + record.topic());
                }
            }
        }
    }
}
