/**
 * Frame with source mac address and destination mac address
 */
public class Frame {
    private final String sourceMAC;
    private final String destinationMAC;
    private Data data;

    public Frame(String sourceMAC, String destinationMAC, Data data) {
        this.sourceMAC = sourceMAC;
        this.destinationMAC = destinationMAC;
        this.data = data;
    }

    public Data getMessage() {
        return data;
    }

    public void setMessage(Data message) {
        this.data = message;
    }
}