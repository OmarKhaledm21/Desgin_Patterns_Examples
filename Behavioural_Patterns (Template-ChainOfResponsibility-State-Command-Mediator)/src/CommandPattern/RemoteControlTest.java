package CommandPattern;

public class RemoteControlTest {
    public static void main(String[] args) {
        /*
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.ButtonPressed();
        */
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        Garage garageDoor = new Garage();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.ButtonPressed();
        remote.setCommand(garageOpen);
        remote.ButtonPressed();
    }
}
