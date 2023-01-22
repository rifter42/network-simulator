import java.util.ArrayList;

public class IPv4 implements IPAddress {
    private String IPAddressStr;
    private final long IPAddressInteger;
    private int mask;
    IPv4(String IPAddressStr) throws InvalidIPAddress {
        parseIPv4Address(IPAddressStr);
        String[] IPAddressArr = this.IPAddressStr.split("\\.");
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

    private ArrayList<ArrayList<Integer>> parseIPOctets(String[] IPAddressArr) {
        ArrayList<ArrayList<Integer>> IPOctets = new ArrayList<>();
        for (String IPSliceStr : IPAddressArr) {
            ArrayList<Integer> octet = new ArrayList<>();
            String binary = Integer.toBinaryString(Integer.parseInt(IPSliceStr));
            for (int j = 0; j < binary.length(); j++) {
                octet.add(Integer.parseInt(String.valueOf(binary.charAt(j))));
            }
            while (octet.size() < 8) {
                octet.add(0, 0);
            }
            while (octet.size() > 8) {
                octet.remove(0);
            }
            IPOctets.add(octet);
        }
        return IPOctets;
    }

    private ArrayList<ArrayList<Integer>> parseNetworkOctets(ArrayList<ArrayList<Integer>> IPOctets, int mask) {
        ArrayList<ArrayList<Integer>> networkOctets = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> octet = IPOctets.get(i);
            ArrayList<Integer> networkOctet = new ArrayList<>();
            for (int j = 0; j < 8; j++) {
                int ipBit = octet.get(j);
                if (mask == 0) {
                    networkOctet.add(0);
                } else {
                    networkOctet.add(ipBit);
                    mask -= 1;
                }
            }
            networkOctets.add(networkOctet);
        }
        return networkOctets;
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