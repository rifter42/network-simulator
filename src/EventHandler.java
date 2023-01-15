import java.io.IOException;

public class EventHandler {
    public static Boolean ping(String AddressSource, String AddressDestination) throws IOException {
        boolean pingResult = Ping.execute(AddressSource, AddressDestination);
        return pingResult;
    }
}
