package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilities of your IDE
																			//possibilities was written wrong

/**
 * Class to implement a String queue
 */
public class StringQueue implements Queue {
	
	private List<String> elements = new ArrayList<String>();
	private int maxSize;			//doesn't have to start with a value if the constructor method demands said value

	/**
	 * Constructor method for queue Object
	 * @param maxSize defines the maximum size the queue can have
	 */
	public StringQueue(int maxSize){	//variable maxsize was not used because it was written with s instead of S
		this.maxSize = maxSize;
	}

	/**
	 * main method to debug code
	 * @param args unused parameter
	 */
	public static void main(String[] args) {

		StringQueue q = new StringQueue(5);
		System.out.println(q.offer("hi"));
		System.out.println(q.element());
		System.out.println(q.element());
	}

	/**
	 * Adds an element to the queue
	 * @param obj element to be added
	 * @return returns true if element was succesfully added
	 */
	@Override
	public boolean offer(String obj) {
		if(elements.size()!= maxSize)
			elements.add(obj);
		else
			return false;
		
		return true;
	}

	/**
	 * Looks at the top element removes it from queue and returns it
	 * @return the top element of the queue or null
	 */
	@Override
	public String poll() {
		String element = peek();
		
		if(elements.size() != 0){			//size() == 0 is wrong needs to be !=
			elements.remove(0);
		}
		
		return element;
	}

	/**
	 * Looks at the top element removes it from queue and returns it or throws an exception if the queue is empty
	 * @return the top element of the queue
	 */
	@Override
	public String remove() {
		String element = poll();		//element should not be overwritten so removed 'element = "";'
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

	/**
	 * Looks at the top element of the queue and returns it
	 * @return the top element of the queue or null
	 */
	@Override
	public String peek() {
		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;
		
		return element;
	}

	/**
	 * Looks at the top element of the queue and returns it or throws an exception if the queue is empty
	 * @return the top element of the queue
	 */
	@Override
	public String element() {
		String element = peek();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

}