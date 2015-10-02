package FactoryMethod;

public class ChicagoPizzaStore extends PizzaStore {

	public ChicagoPizzaStore(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		}
		return pizza;
	}

}
