package demo;

import java.util.Arrays;
import java.util.List;

/**
 * lambda使用场景五
 * <p>
 *    reduce 操作，就是通过二元运算对所有元素进行聚合，
 *    最终得到一个结果。例如使用加法对列表进行聚合，
 *    就是将列表中所有元素累加，得到总和。
 * </p>
 */
public class Test5 {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);


        int sum = numList.stream().reduce((x,y) -> x+y).get();

        System.out.println(sum);
    }

}
