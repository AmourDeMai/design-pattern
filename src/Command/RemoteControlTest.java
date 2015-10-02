package Command;

public class RemoteControlTest {
	public static void main(String[] args) {
		Light doorLight = new Light("Door Light");
		Light roomLight = new Light("Room light");
		Stereo salonStereo = new Stereo("Salon stereo");
		CeilingFan salonFan = new CeilingFan("Salon ceiling fan");
		
		LightOnCommand doorLightOnCommand = new LightOnCommand(doorLight);
		LightOnCommand roomLightOnCommand = new LightOnCommand(roomLight);
		
		LightOffCommand doorLightOffCommand = new LightOffCommand(doorLight);
		LightOffCommand roomLightOffCommand = new LightOffCommand(roomLight);
		
		StereoOnWithCDCommand salonStereoOnCommand = new StereoOnWithCDCommand(salonStereo);
		StereoOffWithCDCommand salonStereoOffCommand = new StereoOffWithCDCommand(salonStereo);
		
		CeilingFanHighCommand salonFanHighCommand = new CeilingFanHighCommand(salonFan);
		CeilingFanMediumCommand salonFanMediumCommand = new CeilingFanMediumCommand(salonFan);
		CeilingFanLowCommand salonFanLowCommand = new CeilingFanLowCommand(salonFan);
		CeilingFanOffCommand salonFanOffCommand = new CeilingFanOffCommand(salonFan);
		
		Command[] commandsOn = { doorLightOnCommand, salonStereoOnCommand, salonFanHighCommand };
		Command[] commandsOff = { doorLightOffCommand, salonStereoOffCommand, salonFanOffCommand };
		MacroCommand macroCommandOn = new MacroCommand(commandsOn);
		MacroCommand macroCommandOff = new MacroCommand(commandsOff);
		
		
		RemoteControl control = new RemoteControl();
		control.setCommand(0, doorLightOnCommand, doorLightOffCommand);
		control.setCommand(1, roomLightOnCommand, roomLightOffCommand);
		control.setCommand(2, salonStereoOnCommand, salonStereoOffCommand);
		control.setCommand(3, salonFanHighCommand, salonFanOffCommand);
		control.setCommand(4, salonFanMediumCommand, salonFanOffCommand);
		control.setCommand(5, salonFanLowCommand, salonFanOffCommand);
		control.setCommand(6, macroCommandOn, macroCommandOff);
		
		System.out.println(control);
		control.onButtonWasPressed(0);
		control.offButtonWasPressed(0);
		
		control.onButtonWasPressed(1);
		control.offButtonWasPressed(1);	
		
		control.onButtonWasPressed(2);
		control.offButtonWasPressed(2);
		
		control.onButtonWasPressed(3);
		control.onButtonWasPressed(4);
		control.onButtonWasPressed(5);
		control.offButtonWasPressed(5);
		
		System.out.println("\nWe will push undo command");
		control.undoCommandWasPressed();
		
		System.out.println("\nTest MacroCommand");
		control.onButtonWasPressed(6);
	}
}
