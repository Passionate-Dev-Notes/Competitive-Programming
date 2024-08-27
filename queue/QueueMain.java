package queue;

public class QueueMain {

	public static void main(String[] args) {
		OperationOnQueue queue = new OperationOnQueue();
		queue.enQueue(5);
		queue.enQueue(6);
		queue.enQueue(7);
		queue.enQueue(8);
		queue.enQueue(9);
		//queue.enQueue(10);
		/*
		 * queue.enQueue(10); queue.enQueue(5);
		 */
		queue.Show();
		

	}

}
