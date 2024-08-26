package linkedList;
class Node{
	int data;
	Node next;
}
class LinkedListOperation{
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null) {
			head = node;
		}
		else {
			Node n =head;
			while(n.next != null) {
				n= n.next;
			}
			n.next= node;
		}
	}
	public void show() {
		Node node = head;
		while(node.next != null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.print(node.data);
	}
	
	public void insertAtStarting(int data) {
		Node node = new Node();
		node.data = data;
		//node.next=null;
		node.next = head;
		head=node;
	}
	public void insertAtParticularIndex(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next =null;
		
		Node n = head;
		if(index == 0) {
			insertAtStarting(data);
		}
		else {
			for(int i =0; i<index;i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}

	}
	public void deleteAt(int index) {
		if(index == 0) {
			head = head.next;
		}
		else {
			Node n = head;
			Node n1 = null;
			for(int i =0; i<index-1;i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			
		}
	}
}

public class LinkedList {

	public static void main(String[] args) {
	   LinkedListOperation obj = new LinkedListOperation();
	   obj.insert(10);
	   obj.insert(15);
	   obj.insert(19);
	   obj.insert(21);
	   obj.insert(12);
	   obj.insertAtStarting(5);
	   obj.insertAtParticularIndex(1, 30);
	   obj.deleteAt(2);
	   obj.show();
	}

}
