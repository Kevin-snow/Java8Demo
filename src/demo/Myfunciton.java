package demo;

/**
 * 自定义一个函数式接口
 */
@FunctionalInterface
interface Myfunciton<T,R> {
    R handler(T t1, T t2);
}
