package org.tcs.preparation;

import org.tcs.preparation.StackUsingLinkedList;

public class runthell
{

	public static void main(String[] args)
	{
		
		StackUsingLinkedList stackll = new StackUsingLinkedList();
		
		stackll.push(10);   
		
		stackll.push(20);
		
		stackll.push(30);
		
		stackll.push(40);
		
		stackll.displayStack();
		
		stackll.pop();
		
		stackll.displayStack();
		
		stackll.pop();
		
		stackll.displayStack();
		
		stackll.push(999);
		
		stackll.displayStack();
		
		/////////////////////////////////////////////////////
		
		System.out.println("Displaying Queeu Now : ");
		
		QueueUsingLinkedList Qll = new QueueUsingLinkedList();
		
		Qll.insert(656);  
		
		Qll.displayQueue();
		
		Qll.insert(757);
		
		Qll.displayQueue();
		
		Qll.insert(858);
		
		Qll.displayQueue();
		
		Qll.insert(959);
		
		Qll.displayQueue();
		
		Qll.remove();
		
		Qll.displayQueue();
		
		Qll.remove();
		
		Qll.displayQueue();
		
		Qll.insert(111);
		
		Qll.displayQueue();
		
		
		
		
		
		
			
	}

}
