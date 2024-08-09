package patterns.iterator;

import java.util.Iterator;
import java.util.List;

public class NumIterator implements Iterator<Integer>{
	List<Integer> m;
	int ctr;
	
	NumIterator(List<Integer> n){
		this.m = n;
	}
	
	@Override
	public boolean hasNext(){
		if(ctr < this.m.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Integer next() {
	  return this.m.get(ctr++);
	}
}
