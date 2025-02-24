public class SmartHome {
    public static void main(String[] args) {
        SmartHomeSystem home = new SmartHomeSystem();

        Light livingRoomLight = new Light("Living Room");
        AirConditioner bedroomAC = new AirConditioner("Bedroom");
        SecurityAlarm frontDoorAlarm = new SecurityAlarm("Front Door", "4321");
        SmokeDetector kitchenSmokeDetector = new SmokeDetector("Kitchen");
        SecurityCamera securityCamera = new SecurityCamera("Main Gate");



        home.addDevice(livingRoomLight);
//        home.addDevice(bedroomAC);
//        home.addDevice(frontDoorAlarm);
//        home.addDevice(kitchenSmokeDetector);

//        livingRoomLight.setColor("Red");
//        livingRoomLight.setIntensity(300);
        livingRoomLight.adjustSettings();

//        home.listDevices();

//        livingRoomLight.turnOn();
//        bedroomAC.turnOn();
//        frontDoorAlarm.verifyPassword("4321");
//        kitchenSmokeDetector.activateSprinkle();
    }
}
