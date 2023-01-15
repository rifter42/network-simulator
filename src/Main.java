import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            Map<String, List> config = new ConfigurationFactory().loadConfig("config.toml");
            List<Computer> computers = config.get("computers");

            String IP1 = String.valueOf(computers.get(0).getIp());
            String IP2 = String.valueOf(computers.get(1).getIp());

            System.out.println("PING " + IP2 + "(" + IP2 + ") " + " 56(84) bytes of data");

            if(EventHandler.ping(IP1, IP2)){
                int n = 5;
                for (int i = 1; i <= n; ++i) {
                    System.out.println("64 bytes from " + IP2 + " : icmp_seq=1 ttl=57 time=5.29 ms");
                }
            }

            List<Router> routers = config.get("routers");
            for (Router router: routers) {
                System.out.println(router.getIp());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}