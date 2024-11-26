package demo;

public class Test9 {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };
        r.run();
        System.out.println("*************************");
        Runnable r1 = () -> System.out.println("hello world");
        r1.run();

    }



}
