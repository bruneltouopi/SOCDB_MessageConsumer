package cacf.db.processing.stream.message.output;

/**
 * Message content for API
 */
public class MessagecontentApi extends MessageContent {

    // optional
    private String details;
    private String data;

    /**
     * @return the details
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(String details) {
        this.details = details;
    }
}
