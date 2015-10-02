package SimpleFactory;

public class UnknownPizza extends Pizza {
	public UnknownPizza(String name) {
		this.name = name;
	}
	
	void prepare() {
	}
	
	void bake() {
	}
	
	void cut() {
	}
	
	void box() {
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
