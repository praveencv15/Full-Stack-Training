package practice;
import java.util.*;

public class BufferDemo {
    private Queue<Integer> buffer = new LinkedList<>();
    private int cap = 5;

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == cap) {
            wait();
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        int item = buffer.poll();
        System.out.println("Consumed: " + item);
        notifyAll();
    }

    public static void main(String[] args) {
        BufferDemo buffer = new BufferDemo();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    buffer.produce(i);
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    buffer.consume();
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
