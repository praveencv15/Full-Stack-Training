package practice;
import java.util.*;

class ThreadDemo extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+ " Value of i "+ i);
		}
	}
	public static void main(String[]args) {
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		ThreadDemo t2 = new ThreadDemo();
		t2.start();
	}
}
