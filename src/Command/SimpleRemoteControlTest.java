package Command;

public class SimpleRemoteControlTest {
	public static void main(String[] args) {
		Light light = new Light("Door");
		Command commandOn = new LightOnCommand(light);
		Command commandOff = new LightOffCommand(light);
		
		SimpleRemoteControl control = new SimpleRemoteControl();
		control.setCommand(commandOn);
		control.buttonWasPressed();
		control.undoCommandWasPressed();
		
		control.setCommand(commandOff);
		control.buttonWasPressed();
		control.undoCommandWasPressed();
	}
}
