package patterns;

import java.util.Iterator;

public class StrIterable implements Iterable<String>{
	private String arr[];
	
	StrIterable(String[] arr){
		this.arr = arr;
	}

	@Override
	public Iterator<String> iterator(){
		return new StrIterator(arr);
	}
}
