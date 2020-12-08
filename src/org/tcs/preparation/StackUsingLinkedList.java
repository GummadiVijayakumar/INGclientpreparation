package org.tcs.preparation;

import java.util.LinkedList;

public class StackUsingLinkedList 
{
		
		 LinkedList<Integer> stackusingLL = new LinkedList(); 
		    
		   
		    public void push(int value)
		    {
		    	stackusingLL.addFirst(value);
		    }
		 
		   
		    public void pop() throws EmptyException
		    {
		           try
		           {
		        	   
		        	   stackusingLL.removeFirst();
		           }
		           catch(LinkedListEmptyException llee)
		           {
		                  throw new EmptyException();
		           }
		    }
		 
		   
		    public void displayStack() 
		    {
		           System.out.print("Displaying Stack >  Top to Bottom : ");
		           
		           
		        	   System.out.println(stackusingLL);
		           
		    }
		

}
