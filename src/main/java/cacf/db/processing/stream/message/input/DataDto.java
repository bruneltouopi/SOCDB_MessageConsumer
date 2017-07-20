package cacf.db.processing.stream.message.input;

/**
 * Content Value of Data.
 * @param <T>
 */
public class DataDto<T> {

    private T value;

    /**
     * @return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(T value) {
        this.value = value;
    }
}
