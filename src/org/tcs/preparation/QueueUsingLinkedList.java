package org.tcs.preparation;

import java.util.LinkedList;

public class QueueUsingLinkedList
{
	
	 LinkedList<Integer> QusingLL = new LinkedList(); 
	    
	   
	    public void insert(int value)
	    {
	    	QusingLL.addLast(value);
	    }
	 
	   
	    public void remove() throws EmptyException
	    {
	           try
	           {
	        	   
	        	   QusingLL.removeFirst();
	           }
	           catch(LinkedListEmptyException llee)
	           {
	                  throw new EmptyException();
	           }
	    }
	 
	   
	    public void displayQueue() 
	    {
	           System.out.print("Displaying Stack >  Top to Bottom : ");
	           
	           
	        	   System.out.println(QusingLL);
	           
	    }
	

}
