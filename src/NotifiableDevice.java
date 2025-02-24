abstract class NotifiableDevice extends SmartDevice {
    protected boolean notificationsEnabled;

    public NotifiableDevice(String name, String location) {
        super(name, location);
        this.notificationsEnabled = true;
    }

    public void enableNotifications() {
        notificationsEnabled = true;
    }

    public void disableNotifications() {
        notificationsEnabled = false;
    }
}