package Command;

public class Stereo {
	private String name;
	private int volume;
	
	public Stereo(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println("stereo " + name + " on");
	}
	
	public void off() {
		System.out.println("stereo " + name + " off");
	}
	
	public void setCD() {
		System.out.println("stereo " + name + " is setting the CD...");
	}
	
	public void setDVD() {
		System.out.println("stereo " + name + " is setting the DVD...");
	}
	
	public void setRadio() {
		System.out.println("stereo " + name + " is setting the Radio...");
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("stereo " + name + " is setting the volume[" + this.volume + "]");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
