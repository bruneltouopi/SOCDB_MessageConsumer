package cacf.db.processing.stream.mapper;

import cacf.db.processing.stream.message.input.MessageApi;
import cacf.db.processing.stream.message.output.MessageContent;
import cacf.db.processing.stream.message.output.MessageOut;
import cacf.db.processing.stream.message.output.MessagecontentApi;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;

/**
 * Mapper for Message API
 */
public class MessageApiMapper extends CustomMapper<MessageApi,MessageOut> {

    @Override
    public void mapAtoB(MessageApi messageApi, MessageOut messageOut, MappingContext context) {
        messageOut.setContent(messageApi.getContent());
    }
}
