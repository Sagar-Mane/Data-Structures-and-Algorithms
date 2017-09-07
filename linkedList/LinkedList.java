package linkedList;

public class LinkedList {

	Node Head;	

	/**
	 * Linked list traversal
	 */
	public void print(){
		
		Node current=Head;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}

	/**
	 * Method to insert element at the start of the linked list
	 * @param data to be inserted
	 */
	public void insertFront(int data){
		Node newNode=new Node(data);
		newNode.next=Head;
		Head=newNode;
	}
	/**
	 * Method to insert element at the end of the list
	 * @param data to be inserted
	 */
	public void insertEnd(int data){
		Node newNode=new Node(data);
		if(Head==null){
			Head=newNode;
			return; 
		}
		Node current=Head;
		while(current.next!=null){
			current=current.next;
		}
		current.next=newNode;
		return;
	}
	

	public void insertAt(Node head, int data, int position){
		
		Node newNode=new Node(data);
		Node current=head;
		int i=0;
		
		if(head==null){
			head=newNode;
		}
		
		if(position==0){
			newNode.next=head;
			head=newNode;
		}
		
		while(i<position && current.next!=null){
			current=current.next;
			i++;
		}
		newNode.next=current.next;
		current.next=newNode;	
		
	}
	
	public static void main(String args[]){
		
		LinkedList l=new LinkedList();
		
		l.Head=new Node(10);
		l.insertFront(20);
		l.insertFront(50);
		l.print();
		System.out.println("---------");
		l.insertAt(l.Head, 545, 1);
		l.print();
		
	}
	
}
