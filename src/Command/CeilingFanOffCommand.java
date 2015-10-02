package Command;

public class CeilingFanOffCommand implements Command {
	private CeilingFan ceilingFan;
	int preSpeed;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		preSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}
	
	public void undo() {
		if (preSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (preSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (preSpeed == CeilingFan.LOW ) {
			ceilingFan.low();
		} else {
			ceilingFan.off();
		}
	}
}
