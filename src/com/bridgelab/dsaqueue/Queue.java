package com.bridgelab.dsaqueue;

/**********************************************
 * @author mihir
 * 
 * Implementing Data structure concept of Queue
 * using linkedlist.
 * 
 * @since 02-July-2021
 **********************************************/

public class Queue<T>
{
	private Node<T> front;
	private Node<T> rear;
	
	private int length;
	
	/**
	 * Name : enQueue
	 * 
	 * Description : Inserting elements into queue.
	 * 
	 * @param DATA
	 * 
	 * Modification : 02-July-2021
	 */
	public void enQueue(T DATA)
	{
		if(front == null)
		{
			rear = new Node<T>(DATA);
			front = rear ;
		}
		else
		{
			rear.next = new Node<T>(DATA);
			rear = rear.next;
		}
		length++;
	}
	
	//this method will return length of an queue.
	public int size()
	{
		return length;
	}
	
	/**
	 * Name : displayQueue
	 * 
	 * Description : Traversing over queue and printing the element inside queque.
	 * 
	 * Modification : First commit 02-July-2021
	 */
	public void displayQueue()
	{
		Node<T> curretnNode = front;
		while(curretnNode != null)
		{
			System.out.print(curretnNode.DATA+ " ");
			curretnNode = curretnNode.next;
		}
	}
}
