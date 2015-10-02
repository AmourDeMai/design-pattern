package State;

public class GumballMachine {
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		this.count = numberGumballs;
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.soldState = new SoldState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.winnerState = new WinnerState(this);
		
		if(numberGumballs > 0) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuater();
	}
	
	public void ejectQuarter() {
		state.ejectQuater();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void releaseBall() {
		// TODO Auto-generated method stub
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count--;
		}
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public State getNoQuarterState() {
		// TODO Auto-generated method stub
		return noQuarterState;
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getSoldState() {
		return soldState;
	}

	public State getSoldOutState() {
		// TODO Auto-generated method stub
		return soldOutState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}
	
}
