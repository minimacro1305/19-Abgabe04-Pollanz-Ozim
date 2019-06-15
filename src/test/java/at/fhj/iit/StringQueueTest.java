package at.fhj.iit;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

/**
 * Test class to test the StringQueue class
 */
public class StringQueueTest {

    private StringQueue q;

    /**
     * Initializes the StringQueue
     */
    @Before
    public void setup() {
        q = new StringQueue(5);
    }

    /**
     * tests if offer returns true when queue not empty
     */
    @Test
    public void testOffer(){
        assertTrue(q.offer("w"));
    }

    /**
     * tests if peek returns the right value
     */
    @Test
    public void testOffersPeek(){
        q.offer("w");
        q.offer("t");
        assertEquals(q.peek(), "w");
    }

    /**
     * tests if poll returns the right value
     */
    @Test
    public void testOffersPoll(){
        q.offer("w");
        q.offer("t");
        assertEquals(q.poll(), "w");
    }

    /**
     * tests if peek returns null if queue is empty
     */
    @Test
    public void testPeekEmpty(){
        assertNull(q.peek());
    }

    /**
     * tests if poll returns null if queue is empty
     */
    @Test
    public void testPollEmpty(){
        assertNull(q.poll());
    }

    /**
     * tests if offer returns false when queue is full
     */
    @Test
    public void testOffersFull(){
        q.offer("w");
        q.offer("w");
        q.offer("w");
        q.offer("w");
        q.offer("w");
        assertFalse(q.offer("w"));
    }

    /**
     * tests if element returns the right value
     */
    @Test
    public void testOffersElement(){
        q.offer("w");
        assertEquals(q.element(), "w");
    }

    /**
     * tests if remove returns the right value
     */
    @Test
    public void testOffersRemove(){
        q.offer("w");
        assertEquals(q.remove(), "w");
    }

    /**
     * tests if element throws an exception when queue is empty
     */
    @Test
    public void testElementException(){
        boolean except = false;
        try{
            q.element();
        } catch(NoSuchElementException e){
            except=true;
        }
        assertTrue(except);
    }

    /**
     * tests if remove throws an exception when queue is empty
     */
    @Test
    public void testRemoveException(){
        boolean except = false;
        try{
            q.remove();
        } catch(NoSuchElementException e){
            except=true;
        }
        assertTrue(except);
    }

    /**
     * tests if poll removes string from queue
     */
    @Test
    public void testPollRemoves(){
        q.offer("w");
        q.poll();
        assertNull(q.peek());
    }

    /**
     * tests if remove removes string from queue
     */
    @Test
    public void testRemoveRemoves(){
        q.offer("w");
        q.remove();
        assertNull(q.peek());
    }

}
