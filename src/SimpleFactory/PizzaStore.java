package SimpleFactory;

public class PizzaStore {
	String name;
	SimplePizzaFactory simplePizzaFactory;
	
	public PizzaStore(String name) {
		this.name =name;
	}
	
	public Pizza orderPizza(String name) {
		simplePizzaFactory = new SimplePizzaFactory("Shanghai");
		Pizza pizza = simplePizzaFactory.createPizza(name);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
