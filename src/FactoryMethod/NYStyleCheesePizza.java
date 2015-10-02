package FactoryMethod;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "New York style cheese pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara sauce";
		toppings.add("Grated Reggiano Cheese");
	}
}
