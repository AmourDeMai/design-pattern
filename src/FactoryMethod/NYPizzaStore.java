package FactoryMethod;

public class NYPizzaStore extends PizzaStore {

	public NYPizzaStore(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		}
		return pizza;
	}
	
}
