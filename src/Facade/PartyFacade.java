package Facade;

public class PartyFacade {
	private Light light;
	private CeilingFan fan;
	private Stereo stereo;
	
	public PartyFacade(Light light, CeilingFan fan, Stereo stereo) {
		this.light = light;
		this.fan = fan;
		this.stereo = stereo;
	}
	
	public void partyOn() {
		light.on();
		fan.high();
		stereo.on();
	}
	
	public void partyOff() {
		light.off();
		fan.off();
		stereo.off();
	}
}
