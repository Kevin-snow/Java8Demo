package demo;

/**
 * 使用自定义的函数式接口
 */
public class Test6 {

    public static void main(String[] args) {

        int sum = getAdd(1,2, (x,y) -> x+y);
        System.out.println(sum);

    }

    public static Integer getAdd(int x, int y, Myfunciton<Integer,Integer> funciton){
        return funciton.handler(x,y);
    }

}
