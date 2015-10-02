package Command;

public class SimpleRemoteControl {
	Command command;
	Command undoCommand;
	
	public void setCommand(Command command) {
		this.command = command;
		undoCommand = new NoCommand();
	}
	
	public void buttonWasPressed() {
		command.execute();
		undoCommand = command;
	}
	
	public void undoCommandWasPressed() {
		undoCommand.undo();
	}
	
}
