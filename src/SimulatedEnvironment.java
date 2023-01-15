import java.io.IOException;
import java.util.List;
import java.util.Map;

public class SimulatedEnvironment {
    public void startSimulation() {
        try {
            Map<String, List> config = new ConfigurationFactory().loadConfig("config.toml");
            List<Computer> computers = config.get("computers");
            List<SwitchDevice> switches = config.get("switches");
            List<Router> routers = config.get("routers");
            List<CabledConnection> connections = config.get("connections");



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
