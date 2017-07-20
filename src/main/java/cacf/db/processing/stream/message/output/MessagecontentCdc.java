package cacf.db.processing.stream.message.output;

import cacf.db.processing.stream.message.input.DataDto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Message Content for CDC
 */
public class MessagecontentCdc extends MessageContent {

    private List<DataDto<String>> data;
    private Details details;

    public MessagecontentCdc() {
        super();
        details=new Details();
    }

    public class Details{
        private String streamPosition;
        private String transactionId;
        private String changeSeq;
        private String ts;

        public Details() {
            super();
        }

        /**
         * @return the streamPosition
         */
        public String getStreamPosition() {
            return streamPosition;
        }

        /**
         * @param streamPosition the streamPosition to set
         */
        public void setStreamPosition(String streamPosition) {
            this.streamPosition = streamPosition;
        }

        /**
         * @return the transactionId
         */
        public String getTransactionId() {
            return transactionId;
        }

        /**
         * @param transactionId the transactionId to set
         */
        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
        }

        /**
         * @return the changeSeq
         */
        public String getChangeSeq() {
            return changeSeq;
        }

        /**
         * @param changeSeq the changeSeq to set
         */
        public void setChangeSeq(String changeSeq) {
            this.changeSeq = changeSeq;
        }

        /**
         * @return the ts
         */
        public String getTs() {
            return ts;
        }

        /**
         * @param ts the ts to set
         */
        public void setTs(String ts) {
            this.ts = ts;
        }
    }

    /**
     * @return the data
     */
    public List<DataDto<String>> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(List<DataDto<String>> data) {
        this.data = data;
    }

    /**
     * @return the details
     */
    public Details getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(Details details) {
        this.details = details;
    }
}
