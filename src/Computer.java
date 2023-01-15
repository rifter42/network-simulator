import java.beans.EventHandler;
import java.sql.Connection;

public class Computer extends Device {
    String deviceName;
    String macAddress;
    private final java.sql.Connection Connection;

    Computer(String deviceName, java.sql.Connection Connection, String macAddress) {
        this.deviceName = deviceName;
        this.macAddress = macAddress;
        this.Connection = null;
    }

    public Connection getConnectionType() {
        return Connection;
    }


    public EventHandler Event() {
        return null;
    }
}
