package AbstractFactory;

public class Test {
	public static void main(String args[]) {
		PizzaStore store = new NYPizzaStore("New York");
		Pizza pizza = store.orderPizza("cheese");
	}
}
