package at.fhj.iit;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

import java.io.IOException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;




// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilities of your IDE
																			//possibilities was written wrong

/**
 * Class to implement a String queue
 */
public abstract class StringQueue implements Queue {
	
	private static final Logger logger = LogManager.getLogger(StringQueue.class);
	
	private List<String> elements = new ArrayList<String>();
	private int maxSize;			//doesn't have to start with a value if the constructor method demands said value

	/**
	 * Constructor method for queue Object
	 * @param maxSize defines the maximum size the queue can have
	 */
	public StringQueue(int maxSize){	//variable maxsize was not used because it was written with s instead of S
		
		logger.info("constructor with maxSize" + maxSize);
		this.maxSize = maxSize;
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
			
			logger.error("element not added");
			return false;
		logger.info("element added");
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
			logger.error("wrong size");
			
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
		logger.error("removed 'element = ''");
		
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
		logger.info("returns top element");
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
		logger.info("returns top element");
		return element;
	}

}