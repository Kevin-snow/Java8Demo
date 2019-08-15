package demo;

import java.util.Arrays;
import java.util.List;

/**
 * lambda表达式使用场景二
 * 迭代
 */
public class Test2 {


    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("beijing", "shanghai", "chengdu","guangzhou");


        //java8之前的写法
        for (String str:stringList) {
            System.out.println(str);
        }
        System.out.println("------------------------");

        //java8的写法
        stringList.forEach(x-> System.out.println(x));

        System.out.println("------------------------");

        //引用方法的写法
        stringList.forEach(System.out::println);
    }


}
