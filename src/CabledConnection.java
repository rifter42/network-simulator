public class CabledConnection extends Connection {
    private String macFrom;
    private String macTo;

    public CabledConnection(String macFrom, String macTo) {
        this.macFrom = macFrom;
        this.macTo = macTo;
    }

    public String getMacTo() {
        return macTo;
    }

    public String getMacFrom() {
        return macFrom;
    }
}
