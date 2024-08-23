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
}

public class LinkedList {

	public static void main(String[] args) {
	   LinkedListOperation obj = new LinkedListOperation();
	   obj.insert(10);
	   obj.insert(15);
	   obj.insert(19);
	   obj.insert(21);
	   obj.insert(12);
	   obj.show();
	}

}
