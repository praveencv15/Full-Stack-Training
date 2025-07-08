package practice;
import java.util.*;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("A");
        q.offer("B");
        q.offer("C");
        q.offer("D");

        System.out.println("Initial Queue: " + q);

        System.out.println("Element at front (peek): " + q.peek());

        String removed = q.poll();
        System.out.println("Element removed (poll): " + removed);

        System.out.println("Queue after poll: " + q);
	}
}
