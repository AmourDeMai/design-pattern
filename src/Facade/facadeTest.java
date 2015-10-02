package Facade;

public class facadeTest {
	public static void main(String[] args) {
		Light light = new Light("salon");
		CeilingFan fan = new CeilingFan("salon");
		Stereo stereo = new Stereo("salon");
		
		PartyFacade facade = new PartyFacade(light, fan, stereo);
		System.out.println("Let's begin the party...");
		facade.partyOn();
		System.out.println("\nThe party is over...");
		facade.partyOff();
	}
}
