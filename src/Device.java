import java.sql.Connection;

public abstract class Device {

    Computer Computer;
    Router Router;
    Switch Switch;

    public Device getDevice(String deviceName, String macAddress, Connection Connection) {
        return null;
    }

}
