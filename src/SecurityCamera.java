class SecurityCamera extends NotifiableDevice {
    private boolean autoSave;

    public SecurityCamera(String location) {
        super("Security Camera", location);
        this.autoSave = false;
    }

    public void toggleAutoSave() {
        autoSave = !autoSave;
        System.out.println("Auto-save turned " + (autoSave ? "ON" : "OFF"));
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting security camera settings...");
    }
}