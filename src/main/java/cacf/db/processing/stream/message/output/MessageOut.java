package cacf.db.processing.stream.message.output;


/**
 * Standard message formated for Message Ingestion Broker.
 *
 */
public class MessageOut {

    private MessageReception reception;
    private MessageSource source;
    private MessageContent content;

    /**
     * Default Constructor.
     */
    public MessageOut() {
        // instance fields
        this.reception = new MessageReception();
        this.source = new MessageSource();
    }

    /**
     * @return the reception
     */
    public MessageReception getReception() {
        return reception;
    }

    /**
     * @param reception
     *            the reception to set
     */
    public void setReception(MessageReception reception) {
        this.reception = reception;
    }

    /**
     * @return the source
     */
    public MessageSource getSource() {
        return source;
    }

    /**
     * @param source
     *            the source to set
     */
    public void setSource(MessageSource source) {
        this.source = source;
    }

    /**
     * @return the content
     */
    public MessageContent getContent() {
        return content;
    }

    /**
     * @param content
     *            the content to set
     */
    public void setContent(MessageContent content) {
        this.content = content;
    }

}
