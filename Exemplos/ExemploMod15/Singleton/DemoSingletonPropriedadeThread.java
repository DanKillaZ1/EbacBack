package Singleton;

public class DemoSingletonPropriedadeThread {

    public static void main (String args[]){
        Thread t1 = new Thread(new ThreadBar());
        Thread t2 = new Thread(new ThreadFoo());
        t1.start();
        t2.start();

    }

    static class ThreadBar implements Runnable {
        public void run() {
            DemoSingletonPropriedadeThread singleton = DemoSingletonPropriedadeThread.getInstance("Hello");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadFoo implements Runnable {
        public void run() {
            DemoSingletonPropriedadeThread singleton = DemoSingletonPropriedadeThread.getInstance("World");
            System.out.println(((Object) singleton).getValue());
           
        }
    }

    public static DemoSingletonPropriedadeThread getInstance(String string) {
        return null;
    }
    
}
