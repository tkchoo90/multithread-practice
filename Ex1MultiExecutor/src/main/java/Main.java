import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("helloworld");
        new MultiExecutor(Arrays.asList(new one(), new two(), new three())).executeAll();
    }
}

class one implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("thread-01");
        System.out.println("We are in thread " + Thread.currentThread().getName());
    }
}

class two implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("thread-02");
        System.out.println("We are in thread " + Thread.currentThread().getName());

    }
}

class three implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("thread-03");
        System.out.println("We are in thread " + Thread.currentThread().getName());

    }
}