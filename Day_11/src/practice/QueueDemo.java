package practice;
import java.util.*;

public class QueueDemo {
		public static void main(String[] args) {
	        Queue<Integer> queue = new LinkedList<>();
	        for (int i = 1; i <= 5; i++) {
	            queue.offer(i * 10); 
	        }
	        System.out.println("Queue after enqueuing: " + queue);
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Dequeued: " + queue.poll());
	        }
	        System.out.println("Is queue empty? " + queue.isEmpty());
	}
}