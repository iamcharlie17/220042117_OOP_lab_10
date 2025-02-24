class SecurityAlarm extends NotifiableDevice implements SecurityDevice {
    private String password;

    public SecurityAlarm(String location, String password) {
        super("Security Alarm", location);
        this.password = password;
    }

    @Override
    public void verifyPassword(String password) {
        if (this.password.equals(password)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
            if (notificationsEnabled) {
                System.out.println("User notified about failed password attempt.");
            }
        }
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting security alarm settings...");
    }
}