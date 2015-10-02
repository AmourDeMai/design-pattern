package Strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		fly = new FlyWithWings();
		quack = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm mallard duck");
	}
	
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		mallardDuck.setFlyBehavior(new FlyWithoutWings());
		mallardDuck.setQuackBehavior(new MuteQuack());
		
		System.out.println("after changing");
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
	}

}
