import java.io.IOException;
import java.util.List;

public class ConfigurationFactory {
    public List<Computer> loadConfig(String path) throws IOException {
        if (path.contains(".toml")) {
            return new TOMLConfiguration().parseConfig(path);
        }
        else {
            throw new UnsupportedOperationException("This configuration format is not yet implemented");
        }
    }
}
