package AbstractFactory;

public abstract class PizzaStore {
	private String name;
	public PizzaStore(String name) {
		this.name =name;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}
