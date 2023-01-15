import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            Map<String, List> config = new ConfigurationFactory().loadConfig("config.toml");
            List<Computer> computers = config.get("computers");
            for (Computer computer: computers) {
                System.out.println(computer.getIp());
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