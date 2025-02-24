import java.util.ArrayList;
import java.util.List;

class SmartHomeSystem {
    private List<SmartDevice> devices;

    public SmartHomeSystem() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
        System.out.println(device.name + " added to the system.");
    }

    public void removeDevice(SmartDevice device) {
        devices.remove(device);
        System.out.println(device.name + " removed from the system.");
    }

    public void listDevices() {
        System.out.println("Devices in the system:");
        for (SmartDevice device : devices) {
            System.out.println("- " + device.name + " located in " + device.location);
        }
    }
}
