public class Router extends Device {
    private String mac;
    private String ip;

    public Router(String deviceName, String mac, String ip, TypeofDeviceEntity typeOfDeviceEntity) {
        super(deviceName, typeOfDeviceEntity, mac);
        this.mac = mac;
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public String getIp() {
        return ip;
    }
}
