package cacf.db.processing.stream.message.output;


/**
 * Content message of standard message.
 *
 */
public abstract class MessageContent {

    private String format;
    // optional
    private String action;

    /**
     * Default Constructor.
     */
    public MessageContent() {
        super();
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format
     *            the format to set
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action
     *            the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }


}
