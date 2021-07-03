package com.bridgelab.dsaqueue;

public class Node<T>
{
	final T DATA;
	Node<T> next;
	
	public Node(T DATA)
	{
		super();
		this.DATA = DATA;
		this.next = null;
	}
}
