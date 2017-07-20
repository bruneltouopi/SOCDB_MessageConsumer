package cacf.db.processing.stream.message.input;

import cacf.db.processing.stream.message.output.MessageOut;
import cacf.db.processing.stream.message.output.MessagecontentApi;

/**
 * Message from Api Service.
 */
public class MessageApi extends MessageOut {
    private  MessagecontentApi content;

    public MessageApi() {
        content =new MessagecontentApi();
    }

    @Override
    public MessagecontentApi getContent(){
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(MessagecontentApi content) {
        this.content = content;
    }
}
