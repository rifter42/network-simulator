import java.util.ArrayList;

public class IPv4 implements IPAddress {
    private String IPAddressStr;
    private final long IPAddressInteger;
    private int mask;
    IPv4(String IPAddressStr) throws InvalidIPAddress {
        parseIPv4Address(IPAddressStr);
        this.IPAddressInteger = this.parseAsVal(this.IPAddressStr);
    }

    private void parseIPv4Address(String IPAddressStr) throws InvalidIPAddress {
        String[] split = IPAddressStr.split("/");
        if (split.length != 2) {
            throw new InvalidIPAddress("Invalid IP address, given " + IPAddressStr + ", expected format is x.x.x.x/x");
        }

        // Todo: Add pattern matching to verify ip address format
        String addressStr = split[0];
        String maskStr = split[1];
        this.IPAddressStr = addressStr;
        this.mask = Integer.parseInt(maskStr);
    }

    private long parseAsVal(String IPAddressStr) {
        long IPAddressInteger = 0;
        int shiftValue = 24;
        for (String IPStr : IPAddressStr.split("\\.")) {
            long num = Long.parseLong(IPStr);
            IPAddressInteger += num << shiftValue;
            shiftValue -= 8;
        }
        return IPAddressInteger;
    }

    public String getIPAddressStr() {
        return IPAddressStr;
    }

    public long getIPAddressInteger() {
        return IPAddressInteger;
    }

    public int getMask() {
        return mask;
    }
}