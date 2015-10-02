package Singleton;

/**
 * 双重检查加锁
 * @author amourdemai
 * Java 5 以上版本
 */
public class Singleton {
	private volatile static Singleton uniqueInstance;
	
	private Singleton() {
		
	}
	
	public Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}

/**
 * 急切实例化
 */
/*
public class Singleton {
	private static Singleton uniqueInstance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return uniqueInstance;
	}
}
*/