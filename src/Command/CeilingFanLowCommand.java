package Command;

public class CeilingFanLowCommand implements Command {
	private CeilingFan ceilingFan;
	int preSpeed;
	
	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		preSpeed = ceilingFan.getSpeed();
		ceilingFan.low();
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
