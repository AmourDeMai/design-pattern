package Strategy;

public abstract class Duck {
	protected FlyBehavior fly;
	protected QuackBehavior quack;
	
	public Duck() {
		
	}
	
	public void swim() {		
		System.out.println("all the duck can swim");
	}
	
	public abstract void display();
	
	public void setFlyBehavior(FlyBehavior fly) {
		this.fly = fly;
	}
	
	public void setQuackBehavior(QuackBehavior quack) {
		this.quack = quack;
	}
	
	public void performFly() {
		fly.fly();
	}
	
	public void performQuack() {
		quack.quack();
	}
	
}
