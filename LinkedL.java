import java.io.*;
class LinkedL{
	Node head;
	//Nodeclas
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;	
		}
	}
//insert node 
public void add(int data)
	{	
		//check and add data in node
		Node newN=new Node(data);
		//next node to be head
		newN.next=head;
		//head to be newnode added node
		head=newN;
	}
//disply list
public void Display()
	{
		Node temp=head;
		while(temp!=null)
		{
		System.out.print(temp.data+ " ");
		temp=temp.next;
		}
	}
public static void main(String[] args){
	LinkedL list=new LinkedL();
	//adding a values to the link
	list.add(8);
	list.add(9);
	list.add(2);
	list.add(6);
	list.add(7);
	//display method
	list.Display();
	}
	
}