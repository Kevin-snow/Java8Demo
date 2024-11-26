package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 使用自定义的函数式接口
 */
public class Test6 {

    public static void main(String[] args) {

//        int sum = getAdd(1,2, Integer::sum);
//        System.out.println(sum);

//        String specialStr = ",";
//        Arrays.asList("a", "b", "c").forEach(e -> System.out.println(e + specialStr));

        User user1 = new User(1, 18, "张一", "13888888888", "北京市");
        User user2 = new User(2, 19, "张二", "13888888888", "上海市");
        User user3 = new User(3, 20, "张三", "13888888888", "石家庄市");
        User user4 = new User(4, 21, "张四", "13888888888", "郑州市");
        User user5 = new User(5, 22, "张五", "13888888888", "天津市");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        List<String> nameList =  list.stream().map(User::getName).collect(Collectors.toList());
        nameList.forEach(System.out::println);

        List<User> list1 =  list.stream().filter(user -> user.getAge() == 19).collect(Collectors.toList());

        list1.forEach(user -> System.out.println(user.getAge()));

    }

    public static Integer getAdd(int x, int y, MyFunction<Integer,Integer> funciton){
        return funciton.handler(x,y);
    }

}
