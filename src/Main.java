import java.io.IOException;
import java.util.List;
import java.util.Map;
public class Main {
    /**
     * Initializes and runs the simulation
     * @param args Accepts configuration file name as the first argument
     */
    public static void main(String[] args) {
        SimulatedEnvironment env = new SimulatedEnvironment();
        env.startSimulation();
    }
}