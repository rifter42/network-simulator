

import com.moandjiezana.toml.Toml;

import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TOMLConfiguration implements Configuration {
    public Map<String, List> parseConfig(String path) throws IOException {
        File file = new File(path);
        Toml toml = new Toml().read(file);
        Map<String, List> devices = parseDevices(toml);

        return devices;
    }

    private Map<String, List> parseDevices(Toml data) {
        Map<String, List> devices = new HashMap<String, List>();
        devices.put("computers", parseObject(data, "devices.computers"));
        devices.put("switches", parseObject(data, "devices.switches"));
        devices.put("routers", parseObject(data, "devices.routers"));

        return devices;
    }

    private List<Device> parseObject(Toml data, String key) {
        List<Device> objectList = new ArrayList<>();
        List<Toml> objects = data.getTables(key);
        for (Toml object: objects) {
            if(key.contains("computers")) {
                Device dev = object.to(Computer.class);
                objectList.add(dev);
            }
            if(key.contains("switches")) {
                Device dev = object.to(SwitchDevice.class);
                objectList.add(dev);
            }
            if(key.contains("routers")) {
                Device dev = object.to(Router.class);
                objectList.add(dev);
            }
        }

        return objectList;
    }

}
