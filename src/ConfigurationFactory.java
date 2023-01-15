import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ConfigurationFactory {
    /**
     * Loading the config file
     * @param path
     * @return
     * @throws IOException
     */
    public Map<String, List> loadConfig(String path) throws IOException {
        if (path.contains(".toml")) {
            return new TOMLConfiguration().parseConfig(path);
        }
        else {
            throw new UnsupportedOperationException("This configuration format is not yet implemented");
        }
    }
}
