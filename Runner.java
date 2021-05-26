package LinkedListExamples;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList list=new SingleLinkedList();
		list.insert(5);
		list.insert(20);
		list.insert(15);
		list.insert(25);
		list.insert(10);
		
		System.out.println("Node data at start is-");
	 	list.insertAtStart(30);                              //Output- 30 5 20 15 25 10
		list.show();
	 	
		System.out.println("Node inserted in between is-");
		list.insertInBetween(4, 36);                         //Output- 30 5 20 15 36 25 10 
        list.show();

		System.out.println("Node deleted-");
		list.delete(3);                                      //Output- 30 5 20 36 25 10
		list.show();

		System.out.println("Linked list is reversed-");
		list.reverse();                                      //Output- 10 25 36 20 5 30
		list.show();

		System.out.println("Sorted Linked List-");
		list.sort();                                         //Output- 5 10 20 25 30 36
		
		System.out.println("Mid of the linked list is-");                            
		list.mid();                                          //Output- 25

		System.out.println("Node data you searched is");		
		System.out.println(list.search(34));                 //Output- False
	
	}

}
