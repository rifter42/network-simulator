import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Computer> config = new ConfigurationFactory().loadConfig("config.toml");
            for (Computer computer: config) {
                System.out.println(computer.getIp());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}