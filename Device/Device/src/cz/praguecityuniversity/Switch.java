package cz.praguecityuniversity;

import java.beans.EventHandler;
import java.sql.Connection;

public class Switch extends Device {
    String deviceName;
    String macAddress;
    private final Connection Connection;

    Switch(String deviceName, Connection Connection, String macAddress) {
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
