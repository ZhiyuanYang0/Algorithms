package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ZigzagIterator {
	    Iterator<Integer> itr1, itr2;
	    int index = 0;
	    
	    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
	        itr1 = v1.iterator();
	        itr2 = v2.iterator();
	    }

	    public int next() {
	        if (index == 0) {
	        	if (itr1.hasNext()) {
	        		index = 1;
	        		return itr1.next();
	        	} else {
	        		index = 1;
	        	}
	        } 
	        if (itr2.hasNext()) {
	        	if (itr2.hasNext()) {
	        		index = 0;
	        		return itr2.next();
	        	} else {
	        		index = 0;
	        	}
	        }
	        return next();
	    }

	    public boolean hasNext() {
	        return itr1.hasNext() || itr2.hasNext();
	    }
	}

	/**
	 * Your ZigzagIterator object will be instantiated and called as such:
	 * ZigzagIterator i = new ZigzagIterator(v1, v2);
	 * while (i.hasNext()) v[f()] = i.next();
	 */

