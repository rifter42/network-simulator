/**
 * An abstract class to represent data object
 */
abstract public class Data {
    private String data;

    public Data(String data) {
        this.data = data;
    }

    public abstract IPAddress getSourceIP();

    public abstract void setSourceIP(IPAddress sourceIP);

    public abstract IPAddress getDestinationIP();

    public abstract void setDestinationIP(IPAddress destinationIP);

    public abstract TypeOfMessage getTypeOfMessage();

    public abstract void setTypeOfMessage(TypeOfMessage typeOfMessage);

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
