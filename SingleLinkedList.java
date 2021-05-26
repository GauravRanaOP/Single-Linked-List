package LinkedListExamples;

public class SingleLinkedList {

	Node head;
	
	public void insert(int data) {                     //Insertion of Data in a form of linked list
		Node curr=new Node();
		curr.data=data;
		
		if(head==null) {
			head=curr;
		}
		else 
		{
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=curr;
		}
	}
	
	public void show() {                               //Linked List showing in form of Output
		Node curr=head;
		while(curr.next!=null)
		{
			System.out.print(curr.data+ " ");
			curr=curr.next;
		}
		System.out.println(curr.data);
	}
	
	public void insertAtStart(int data) {              //Insert a node at start
		Node start=new Node();
		start.data=data;
		start.next=head;		
		head=start;
	}
	
	
	public void insertInBetween(int index,int data) {  //Insert a node in between
		Node insert=new Node();
		insert.data=data;
		
		if(index==0) {
			insertAtStart(data);
			return;
		}
		Node curr=head;
		for(int i=0;i<index-1;i++) {
			curr=curr.next;
		}
		insert.next=curr.next;
		curr.next=insert;
	}
	
	public boolean search(int data) {                  //Search a node and return true ,false
    	Node curr=head;
    	while(curr!=null) 
    	{
    		if(curr.data == data) 
    			return true;
    		curr=curr.next;			
    	}
		return false; 
    }
	
	public void delete(int index) {                    //Delete a node
		if (index==0) {
			head=head.next;
		}else
		{
		Node curr=head;
		for(int i=0;i<index-1;i++)
		{
			curr=curr.next;
		}
		Node delete=new Node();
		delete=curr.next;
		curr.next=delete.next;
		}
	}
	
	public void reverse() {                           // Reverse the linked list
		Node curr=head;
		Node prev=null;
		Node next=null;
				
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
			show();
		}
	
	 public void sort() {                            //Sort the linked list 
		   Node curr=head;
		   Node next=null;
		   int temp;
		   while(curr!=null) 
		   {
			   next=curr.next;
			   while(next!=null)
			   {
			   if(curr.data>next.data)
			   {
				   temp=next.data;
				   next.data=curr.data;
				   curr.data=temp;
			   }
			   next=next.next;
			   }
			   System.out.print(curr.data+" ");
			   curr=curr.next;
		   }
	   }
	
	 public void mid() {                            //Finding the mid of a linked list
		   Node fast=head;
		   Node slow=head;	   
		   while(fast!=null && fast.next!=null)
		   {
			   fast=fast.next.next;
			   slow=slow.next;
		   }
		   System.out.println(slow.data);
	   }
	
}
