package queue;

public class QueueWithCircularArrayMain {

	public static void main(String[] args) {
		CircularQueue cQueue = new CircularQueue();
		cQueue.enQueue(28);
		cQueue.enQueue(32);
		cQueue.enQueue(87);
		cQueue.enQueue(32);
		cQueue.enQueue(38);
		cQueue.enQueue(58);
		cQueue.show();
	}

}
