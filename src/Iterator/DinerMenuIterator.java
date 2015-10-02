package Iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
	MenuItem[] list;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = list[position];
		position++;
		return menuItem;
	}
	
	public void move() {
		if (position < 0) {
			throw new IllegalStateException("You can't remove an item until you've done at least one next()");
		} 
		if (list[position-1] != null) {
			for (int i = position; i < (list.length - 1); i++) {
				list[i] = list[i+1];
			}
		} 
		list[list.length-1] = null;
	}

}
