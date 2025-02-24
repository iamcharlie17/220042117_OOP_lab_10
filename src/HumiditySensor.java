class HumiditySensor extends NotifiableDevice implements SensoryDevice {
    public HumiditySensor(String location) {
        super("Humidity Sensor", location);
    }

    @Override
    public void measure() {
        System.out.println("Measuring humidity...");
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting humidity sensor settings...");
    }
}