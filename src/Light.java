class Light extends SmartDevice implements PoweredDevice {
    private int intensity;
    private String color;

    public Light(String location) {
        super("Light", location);
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting light settings to " + intensity + " Lux and color " + color);
    }

    @Override
    public void adjustPowerSettings() {
        System.out.println("Adjusting light intensity to " + intensity + " Lux and color to " + color);
    }
}