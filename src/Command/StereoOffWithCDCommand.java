package Command;

public class StereoOffWithCDCommand implements Command {
	private Stereo stereo;
	
	public StereoOffWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
}
