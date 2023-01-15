public class SwitchDevice extends Device {
    /**
     * Implementation of SwitchDevice
     */

    /**
     * Gets MAC Address and IP Address.
     * @return Returns MAC and IP
     */
    private String mac;

    public SwitchDevice(String mac) {
        this.mac = mac;
    }

    public String getMac() {
        return mac;
    }
}
