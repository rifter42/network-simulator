public class Computer extends Device {
    /**
     * Implementation of Router
     */
    private String ip;
    private String mac;

    public Computer(String ip, String mac) {
        this.ip = ip;
        this.mac = mac;
    }

    /**
     * Gets MAC Address and IP Address.
     * @return Returns MAC and IP
     */

    public String getMac() {
        return mac;
    }

    public String getIp() {
        return ip;
    }
}
