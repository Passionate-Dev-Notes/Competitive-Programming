package queue;

public class CircularQueue {
	int queue[] = new int [5];
	int n = queue.length;
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		queue[rear] = data;
		rear = (rear+1)%n;
		size= size+1;
	}
	
	public void show() {
		for(int i = 0; i< queue.length; i++) {
			System.out.print(queue[i]+" ");
		}
	}
	

}
