import java.lang.reflect.Method;
import java.util.ArrayList;

//TODO  测试泛型擦除
public class TestGenericErasure{

    public static void main(String[] args) throws Exception {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("abc");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(123);
        System.out.println(list1.getClass() == list2.getClass());


        Method method = list1.getClass().getMethod("add", Object.class);
        method.invoke(list1,123456);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

    }

}
