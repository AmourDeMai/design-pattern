package SimpleFactory;

public class OrderPizzaTest {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore("Shanghai");
		pizzaStore.orderPizza("cheese");
		pizzaStore.orderPizza("veggie");
	}
}
