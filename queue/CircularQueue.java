package queue;

public class CircularQueue {
	int queue[] = new int [5];
	int n = queue.length;
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		if(size() <= n) {
			queue[rear] = data;
			rear = (rear+1)%n;
			size= size+1;
		}
		else {
			System.out.println("Queue is full");
		}
		
	}
	public void deQueue() {
		if(!isEmpty()) {
			int data = queue[front];
			front = (front +1)%n;
			size--;
		}
		else {
			System.out.println("Queue is empty");
		}
	}
	public int size() {
		return rear;
	}
	public boolean isEmpty() {
		return rear<=0;
	}
	
	public void show() {
		for(int i = 0; i< queue.length; i++) {
			System.out.print(queue[(front+i)%n]+" ");
		}
	}
	

}
