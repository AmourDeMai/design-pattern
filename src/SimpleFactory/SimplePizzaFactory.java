package SimpleFactory;

public class SimplePizzaFactory {
	private String name;
	
	public SimplePizzaFactory(String name) {	
		this.name = name;
	}
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;		
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else {
			System.out.println("Sorry we donot have " + type + " pizza");
			pizza = new UnknownPizza(type);
		}
		return pizza;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
