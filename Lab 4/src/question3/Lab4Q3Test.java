package question3;

public class Lab4Q3Test {
	public static void main(String[] args) {
		QueueADT<Integer> queue = new LinkedListCircularQueue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		System.out.println("Queue size: " + queue.size() + " Queue contents: " + queue);
		queue.dequeue();
		queue.dequeue();
		System.out.println("Queue size: " + queue.size() + " first item: " + queue.first());
		queue.enqueue(3);
		System.out.println("Queue contents: " + queue);
		queue.dequeue();
		queue.dequeue();// should show a message (e.g., "Queue is empty, can't remove any item") as the
						// queue is empty
		queue.enqueue(4);
		queue.enqueue(5);
		System.out.println("First item: " + queue.first());
		System.out.println("Queue contents: " + queue);
	}

}
