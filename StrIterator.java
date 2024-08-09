package patterns;

import java.util.Iterator;

public class StrIterator implements Iterator<String> {
	String arr[];
	int ctr;

	StrIterator(String arr[]) {
		this.arr = arr;
	}

	@Override
	public boolean hasNext() {
		boolean ispresent = false;
		if(ctr < arr.length) {
			ispresent = true;
		}
		return ispresent;
	}

	@Override
	public String next() {
		return this.arr[ctr++];
	}
	
	public static void main(String args[]) {
		String arr[] = {"1", "2", "3", "4"};
		Iterable<String> striterable = new StrIterable(arr);
		Iterator<String> str = striterable.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
	}
}
