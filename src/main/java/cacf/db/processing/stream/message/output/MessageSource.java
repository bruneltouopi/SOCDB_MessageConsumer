package cacf.db.processing.stream.message.output;

/**
 * Source message of standard message.
 *
 */
public class MessageSource {

    /**
     * Source part message of source message.
     *
     *
     */
    public class GanaMessageSourcePart {

        // optional
        private String type;
        private String name;
        private String object;

        /**
         * Default Constructor.
         */
        public GanaMessageSourcePart() {
            super();
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @return the object
         */
        public String getObject() {
            return object;
        }

        /**
         * @return the type
         */
        public String getType() {
            return type;
        }

        /**
         * @param name
         *            the name to set
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @param object
         *            the object to set
         */
        public void setObject(String object) {
            this.object = object;
        }

        /**
         * @param type
         *            the type to set
         */
        public void setType(String type) {
            this.type = type;
        }

    }

    private String name;
    // optional
    private String location;

    private GanaMessageSourcePart part;

    /**
     * Default Constructor.
     */
    public MessageSource() {
        super();
        this.part = new GanaMessageSourcePart();
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the part
     */
    public GanaMessageSourcePart getPart() {
        return part;
    }

    /**
     * @param location
     *            the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param part
     *            the part to set
     */
    public void setPart(GanaMessageSourcePart part) {
        this.part = part;
    }
}
