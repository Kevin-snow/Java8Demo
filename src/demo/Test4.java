package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * lambda使用场景四
 * <p>使用 Stream 对象的 map 方法将原来的列表
 * 经由 Lambda 表达式映射为另一个列表，并通过 collect
 * 方法转换回 List 类型
 * </p>
 */
public class Test4 {

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("beijing", "shanghai", "chengdu","guangzhou");

        List<String> mapped = strList.stream().map(x -> x + ".").collect(Collectors.toList());

        mapped.stream().forEach(x -> System.out.println(x));
    }
}
