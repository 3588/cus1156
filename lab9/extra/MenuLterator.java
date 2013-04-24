package lab9.extra;

import java.util.Iterator;

	public class MenuLterator implements Iterator { 
	    MenuItem[] data; 
	    int position = 0; 
	    public MenuLterator(MenuItem[] data) { 
	        this.data = data; 
	    } 
	    public Object next() { 
	        MenuItem temp = data[position]; 
	        position = position + 1; 
	        return temp; 
	    } 
	    public boolean hasNext() { 
	        if (position >= data.length || data[position] == null) { 
	            return false; 
	        } else { 
	            return true; 
	        } 
	    } 
	public void remove() {
	        if (position <= 0) { 
	            throw new IllegalStateException 
	                ("Error, Last one"); 
	        } 
	        if (data[position-1] != null)  
	            for (int i = position-1; i < (data.length-1); i++) { 
	            	data[i] = data[i+1]; 
	            
	            data[data.length-1] = null; 
	        } 
	    }
	}
