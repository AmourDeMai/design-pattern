package Component;

public class ComponentTest {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "Breakfast");
		MenuComponent dinerMenu = new Menu("Diner menu", "Lunch");
		MenuComponent cafeMenu = new Menu("Cafe menu", "Dinner");
		MenuComponent dessertMenu = new Menu("Dessert menu", "Dessert of course !");

		MenuComponent allMenus = new Menu("All menus", "All menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		dinerMenu.add(new MenuItem(
				"Pasta",
				"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
				true,
				3.89));
		
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem(
				"Apple Pie",
				"Apple pie with a flakey crust, topped with vanilla ice cream",
				true,
				1.59));
		
		pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
				"Pancakes with scrambled eggs, and toast",
				true,
				2.99));
		
		pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs, sausage",
				true,
				2.99));
		
		
		pancakeHouseMenu.add(new MenuItem("Blueberry Pancake",
				"Pancakes made with fresh blueberries",
				true,
				3.49));
		
		pancakeHouseMenu.add(new MenuItem("Waffles",
				"Waffles, with your choice of blueberries or strawberries",
				true,
				3.99));
	
		Waitress waitress = new Waitress(allMenus);
		
		waitress.printMenu();
	}

}
