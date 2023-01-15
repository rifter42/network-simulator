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
        Map<String, List> devices = new HashMap<>();
        devices.put("computers", parseObject(data, "devices.computers"));
        devices.put("switches", parseObject(data, "devices.switches"));
        devices.put("routers", parseObject(data, "devices.routers"));
        devices.put("connections", parseObject(data, "connections"));

        return devices;
    }

    private List<Object> parseObject(Toml data, String key) {
        List<Object> objectList = new ArrayList<>();
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
            if(key.contains("connections")) {
                if (object.getString("type").contains("cabled")) {
                    Connection con = object.to(CabledConnection.class);
                    objectList.add(con);
                }
                if (object.getString("type").contains("wireless")) {
                    Connection con = object.to(WirelessConnection.class);
                    objectList.add(con);
                }
            }
        }

        return objectList;
    }

}
