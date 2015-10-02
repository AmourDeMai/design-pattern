package Adapter;

public class AdapterTest {
	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}
}
