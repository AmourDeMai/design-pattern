package Command;

public class CeilingFanMediumCommand implements Command {
	private CeilingFan ceilingFan;
	int preSpeed;
	
	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		preSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
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
