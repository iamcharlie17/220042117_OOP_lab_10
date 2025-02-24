abstract class SmartDevice {
    protected String name;
    protected String location;
    protected boolean isOn;

    public SmartDevice(String name, String location) {
        this.name = name;
        this.location = location;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " in " + location + " is turned ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " in " + location + " is turned OFF.");
    }

    abstract void adjustSettings();
}