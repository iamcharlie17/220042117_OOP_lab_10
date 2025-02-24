class AirConditioner extends SmartDevice implements PoweredDevice {
    private String fanSpeed;
    private int temperature;

    public AirConditioner(String location) {
        super("Air Conditioner", location);
    }

    public void setFanSpeed(String fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting AC settings: Fan speed " + fanSpeed + ", Temperature " + temperature + "°C");
    }

    @Override
    public void adjustPowerSettings() {
        System.out.println("Setting fan speed to " + fanSpeed + " and temperature to " + temperature + "°C.");
    }
}