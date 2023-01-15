import java.io.IOException;

public class EventHandler {
    /**
     * Catches events from every part of the network
     * @param AddressSource
     * @param AddressDestination
     * @return
     * @throws IOException
     */
    public static Boolean ping(String AddressSource, String AddressDestination) throws IOException {
        boolean pingResult = Ping.execute(AddressSource, AddressDestination);
        return pingResult;
    }
}
