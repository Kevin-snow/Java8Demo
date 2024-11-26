package demo;

public class Test8 {

    public static void main(String[] args) {

        int i = add(1, 2, Integer::sum);

        System.out.println(i);



    }

    public static int add(int a, int b, IntBinaryOperator operator){
//        int a = 10;
//        int b = 10;

        return operator.applyAsInt(a, b);
    }
}
