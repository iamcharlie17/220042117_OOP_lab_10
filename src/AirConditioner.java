class AirConditioner extends SmartDevice implements PoweredDevice{
    private String fanSpeed;
    private int temparature;

    public AirConditioner(String location) {
        super("Air Conditioner", location);
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting AC settings...");
    }

    @Override
    public void adjustPowerSettings() {
        System.out.println("Setting fan speed and temperature.");
    }
}
