public class Device extends DeviceEntity {
    String deviceName;
    private String macAddress;

    Device(String deviceName, TypeofDeviceEntity typeofDeviceEntity, String macAddress) {
        super(typeofDeviceEntity);
        this.deviceName = deviceName;
        this.macAddress = macAddress;
    }
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
}