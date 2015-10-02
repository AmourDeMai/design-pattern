package Command;

public class Light {
	private String name;
	
	public Light(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println("light " + name + " on");
	}
	
	public void off() {
		System.out.println("light " + name + " off");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
