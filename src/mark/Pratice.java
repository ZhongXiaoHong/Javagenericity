package mark;

import java.util.ArrayList;
import java.util.List;

import p1.*;

public class Pratice {

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        System.out.println(strs.getClass() == doubles.getClass());


//        GenericMethod <String>[] array1;
//        GenericMethod <String>[] array2 = new GenericMethod<String>[10];

        List<Apple> apples = new ArrayList<>();
        List<Fruit> fruits = new ArrayList<>();


        //TODO apples  fruits 完全没有继承关系，是独立的类型
        fruits = apples;
        //TODO 对上面进行优化
        List<? extends Fruit> fruits2 = new ArrayList<>();
        fruits2 = apples;
        fruits2.add(new Apple());//不能写
        fruits2.add(new Fruit());//不能写
        fruits2.get(0);//可以读
        //TODO 【总结】 ? extends Fruit   可以读不能写
        //TODO 【助记】 extends 表示上限 ，？<=Fruit ----->上吐（读）下泄（写）

        //TODO 不允许
        apples = fruits;
        //TODO 优化:
        List<? super Apple> apples2 = new ArrayList<>();
        apples2 = fruits;
        apples2.add(new Apple());//可以写
        apples2.add(new Fruit());//可以写
        Apple a = apples2.get(0);//读



        //TODO 泛型类可以继承或者扩展其他类的
        List<Apple> apples3 = new ArrayList<>();
    }
}
