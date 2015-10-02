package FactoryMethod;

public class FactoreMethodeTest {
	public static void main(String[] args) {
		NYPizzaStore nyStore = new NYPizzaStore("New York");
		ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore("Chicago");
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		Pizza pizza2 = chicagoStore.orderPizza("cheese");
		System.out.println("John ordered a " + pizza2.getName() + "\n");
	}
}
