public class Router extends Device {
    /**
     * Implementation of Router
     */
    private String mac;
    private String ip;

    public Router(String mac, String ip) {
        this.mac = mac;
        this.ip = ip;
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
