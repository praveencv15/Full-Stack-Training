package practice;

class SleepThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Going to sleep");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + " Woke up");
    }

    public static void main(String[] args) {
        SleepThread t1 = new SleepThread();
        SleepThread t2 = new SleepThread();

        System.out.println(t1.getState()); 
        System.out.println(t2.getState());

        t1.start();
        t2.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}
