package cacf.db.processing.stream.mapper;

import cacf.db.processing.stream.message.input.MessageCdc;
import cacf.db.processing.stream.message.output.MessageOut;
import cacf.db.processing.stream.message.output.MessagecontentCdc;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Mapper for Message CDC
 */
public class MessageCdcMapper extends CustomMapper<MessageCdc,MessageOut> {

    @Override
    public void mapAtoB(MessageCdc messageCdc, MessageOut messageOut, MappingContext context) {
        // *** reception ***
        messageOut.getReception().setTimestamp(new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS").format(new Date()));

        messageOut.getReception().setChannel("CDC");
        // optional
        messageOut.getReception().setDetails("");

        // *** source ***
       /* ganaMessage.getSource().setName((String) context.getProperty(GanaContext.APPLICATION_ID));*/
        messageOut.getSource().getPart().setType("DB");
        messageOut.getSource().getPart().setName(messageCdc.getSchema());
        messageOut.getSource().getPart().setObject(messageCdc.getTable());

        // content
        MessagecontentCdc messageContent= new MessagecontentCdc();
       messageContent.setFormat("JSON");
       messageContent.setAction(messageCdc.getOp());
        messageContent.setData(messageCdc.getData());
        MessagecontentCdc.Details details=new MessagecontentCdc().new Details();
        details.setChangeSeq(messageCdc.getChangeSeq());
        details.setStreamPosition(messageCdc.getStreamPosition());
        details.setTs(messageCdc.getTs());
        details.setTransactionId(messageCdc.getTransactionId());
        messageContent.setDetails(details);
        messageOut.setContent(messageContent);


    }
}
