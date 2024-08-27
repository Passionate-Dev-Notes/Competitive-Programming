package queue;

public class OperationOnQueue {
	int front;
	int rear;
	int queue[] = new int [5];
	int size;
	
	public void enQueue(int data) {
		queue[rear] = data;
		rear++;
		size++;
	}
	public int deQueue() {
		int data = queue[front];
		front=front+1;
		size--;
		return 0;
	}
	public void Show() {
		int i =0;
		while(size-1 >= i) {
			System.out.print(queue[front+i]+" ");
			i++;
		}
	}

}
