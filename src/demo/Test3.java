package demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 使用Predicate进行过滤的场景
 */
public class Test3 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8);

        filter(integerList, x -> (int)x%2 == 0);

    }


    //第一种写法
    /**
    public static void filter(List list, Predicate condition){
        list.forEach(x -> {
            if (condition.test(x)){
                System.out.println(x);
            }
        });
    }
**/
    //第二种写法
    public static void filter(List list, Predicate condition){
        list.stream().filter(x->condition.test(x)).forEach(x->System.out.println(x));
    }
}
