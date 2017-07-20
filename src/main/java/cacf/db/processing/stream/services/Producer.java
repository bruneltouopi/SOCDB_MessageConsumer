package cacf.db.processing.stream.services;

import com.google.common.io.Resources;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Send the message to the topics
 */
public class Producer {

    public void publishMessage(String message,String... topics) throws IOException {

        // set up the producer
        KafkaProducer<String, String> producer;
        try (InputStream props = Resources.getResource("producer").openStream()) {
            Properties properties = new Properties();
            properties.load(props);
            producer = new KafkaProducer<>(properties);
        }
        for (String topic : topics) {
            try {

                // every so often send to a different topic
                producer.send(new ProducerRecord<String, String>(
                        topic, message));
                producer.flush();
                System.out.println("Message send " + message);

            } catch (Throwable throwable) {
                System.out.printf("%s", throwable.getStackTrace());
            } finally {
                producer.close();
            }

        }
    }
}

