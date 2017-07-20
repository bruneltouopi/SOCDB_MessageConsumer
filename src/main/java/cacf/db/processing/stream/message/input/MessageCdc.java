package cacf.db.processing.stream.message.input;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Message from CDC.
 */
public class MessageCdc
{


    @JsonProperty("task_name")
    private String taskName;
    private String table;
    private String schema;
    private String op;
    @JsonProperty("stream_position")
    private String streamPosition;
    @JsonProperty("transaction_id")
    private String transactionId;

    @JsonProperty("change_seq")
    private String changeSeq;
    private String ts;
    private ArrayList<DataDto<String>> data;

    public MessageCdc() {
        super();
        data=new ArrayList<>();
    }

    /**
     * @return the taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName the taskName to set
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * @return the table
     */
    public String getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(String table) {
        this.table = table;
    }

    /**
     * @return the schema
     */
    public String getSchema() {
        return schema;
    }

    /**
     * @param schema the schema to set
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * @return the op
     */
    public String getOp() {
        return op;
    }

    /**
     * @param op the op to set
     */
    public void setOp(String op) {
        this.op = op;
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

    /**
     * @return the data
     */
    public ArrayList<DataDto<String>> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(ArrayList<DataDto<String>> data) {
        this.data = data;
    }
}
