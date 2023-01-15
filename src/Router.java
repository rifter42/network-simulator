public class Router extends Device {
    private String mac;
    private String ip;

    public Router(String mac, String ip) {
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
