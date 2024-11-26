package demo;

import java.util.ArrayList;
import java.util.List;

public class Test7 {

    public static void main(String[] args) {
        User user1 = new User(1, 18, "张一", "13888888888", "北京市");
        User user2 = new User(2, 19, "张二", "13888888888", "上海市");
        User user3 = new User(3, 20, "张三", "13888888888", "石家庄市");
        User user4 = new User(4, 21, "张四", "13888888888", "郑州市");
        User user5 = new User(5, 22, "张五", "13888888888", "天津市");

        List<User> list = new ArrayList<>();
        list.add(user4);
        list.add(user3);
        list.add(user1);
        list.add(user2);
        list.add(user5);


//        list.stream().map(User::getName).forEach(System.out::println);

//        list.stream().filter(user -> user.getAge() > 19).forEach(user -> System.out.println(user.getName()));
        list.sort((o1, o2) -> o1.getAge() - o2.getAge());

        list.stream().map(User::getName).forEach(System.out::println);

    }



}
