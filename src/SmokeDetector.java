class SmokeDetector extends NotifiableDevice implements SensoryDevice{
    private boolean sprinkleActive;

    public SmokeDetector(String location) {
        super("Smoke Detector", location);
    }

    public void activateSprinkle(){
        sprinkleActive = true;
        System.out.println("Sprinkle activated.");
    }

    public void deactivateSprinkle(){
        sprinkleActive = false;
        System.out.println("Sprinkle deactivated.");
    }

    @Override
    public void measure() {
        System.out.println("Measuring smoke levels...");
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting smoke detector settings...");
    }
}
