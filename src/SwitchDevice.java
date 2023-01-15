public class SwitchDevice extends Device {
    private String mac;

    public SwitchDevice(String mac) {
        this.mac = mac;
    }

    public String getMac() {
        return mac;
    }
}
