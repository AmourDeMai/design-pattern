package Iterator;

import java.util.Iterator;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dineMenu;
	Menu cafeMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dineMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dineMenu = dineMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() {
		Iterator dinerMenuIterator = dineMenu.createIterator();
		Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
		Iterator cafeMenuIterator = cafeMenu.createIterator();
		System.out.println("Menu\n----\nBREAKFAST");
		printMenu(pancakeHouseMenuIterator);
		System.out.println("\n----\nLUNCH");
		printMenu(dinerMenuIterator);
		System.out.println("\n----\ncafeMenuIterator");
		printMenu(cafeMenuIterator);
	}
	
	public void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
	
}
