import java.io.IOException;
import java.util.List;

interface Configuration {
    List<Computer> parseConfig(String path) throws IOException;
}
