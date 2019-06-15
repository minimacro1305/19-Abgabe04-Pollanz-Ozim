package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilities of your IDE

		//possibilities was written wrong

public class StringQueue implements Queue {
	
	private List<String> elements = new ArrayList<String>();
	private int maxSize;			//doesn't have to start with a value if the constructor method demands said value

	public StringQueue(int maxSize){	//variable maxsize was not used because it was written with s instead of S
		this.maxSize = maxSize;
	}

	public static void main(String[] args) {
		
		//main used for debugging methods
		StringQueue q = new StringQueue(5);
		//System.out.println(q.offer("hi"));
		System.out.println(q.element());
		System.out.println(q.element());
	}
	
	@Override
	public boolean offer(String obj) {		//checks out
		if(elements.size()!= maxSize)
			elements.add(obj);
		else
			return false;
		
		return true;
	}

	@Override
	public String poll() {
		String element = peek();
		
		if(elements.size() != 0){			//size() == 0 is wrong needs to be !=
			elements.remove(0);
		}
		
		return element;
	}

	@Override
	public String remove() {
		String element = poll();		//element should not be overwritten so removed 'element = "";'
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

	@Override
	public String peek() {			//checks out
		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;
		
		return element;
	}

	@Override
	public String element() {			//checks out
		String element = peek();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

}