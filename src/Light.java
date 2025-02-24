class Light extends SmartDevice implements PoweredDevice {
    private int intensity;
    private String color;

    public Light(String location) {
        super("Light", location);
    }


    @Override
    public void adjustPowerSettings() {
        System.out.println("Adjusting light intensity and color.");
    }

    @Override
    void adjustSettings() {
        System.out.println("Adjusting light settings");
    }
}