package patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Conclass {
	List<Integer> list = new ArrayList<Integer>();

	public void add(int num) {
		list.add(new Integer(num));
	}

	class Aggregatable implements Iterable<Integer> {
		@Override
		public Iterator<Integer> iterator() {
			return new NumIterator(list);
		}
	}
	
	public static void main(String args[]) {
		Conclass t = new Conclass();
		t.add(new Integer(1));
		Iterable<Integer> t1 = t.new Aggregatable();
		Iterator<Integer> k = t1.iterator();
		while(k.hasNext()){
			System.out.println(k.next());
		}
	}
}
