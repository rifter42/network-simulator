import java.io.IOException;
import java.util.List;
import java.util.Map;
interface Configuration {
    /**
     * Parses the data from configuration file
     * @param path
     * @return
     * @throws IOException
     */
    Map<String, List> parseConfig(String path) throws IOException;
}
