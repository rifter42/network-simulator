

import com.moandjiezana.toml.Toml;

import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class TOMLConfiguration implements Configuration {
    public List<Computer> parseConfig(String path) throws IOException {
        File file = new File(path);
        Toml toml = new Toml().read(file);
        List<Computer> devices = parseDevices(toml);

        return devices;
    }

    private List<Computer> parseDevices(Toml data) {
        List<Computer> devices = new ArrayList<>();
        List<Toml> computers = data.getTables("devices.computers");
        for (Toml computer : computers) {
            Computer comp = computer.to(Computer.class);
            devices.add(comp);
        }
        return devices;
    }
}
