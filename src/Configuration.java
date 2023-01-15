import java.io.IOException;
import java.util.List;
import java.util.Map;

interface Configuration {
    Map<String, List> parseConfig(String path) throws IOException;
}
