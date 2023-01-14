public class Computer extends Device {
    private String ip;
    private String mac;

    public Computer(String ip, String mac) {
        this.ip = ip;
        this.mac = mac;
    }

    public String getMac() {
        return mac;
    }

    public String getIp() {
        return ip;
    }
}
