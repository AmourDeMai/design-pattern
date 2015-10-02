package Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		Menu dinerMenu = new DinerMenu();
		Menu pancakeHouse = new PancakeHouseMenu();
		Menu cafeMenu = new CafeMenu();
		
		Waitress waitress = new Waitress(pancakeHouse, dinerMenu, cafeMenu);
		waitress.printMenu();
	}
}
