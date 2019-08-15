package demo;

/**
 * lambda表达式使用场景一
 * 代替Runnable
 */
public class Test1 {


    public static void main(String[] args) {


        //java8之前的写法
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("this is java8 before");
            }
        }).start();

        //java8的写法
        new Thread(() -> System.out.println("this is java8's method")).start();
    }
}
