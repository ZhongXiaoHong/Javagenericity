package mark;

public class GenericMethod <T>{

    //TODO 普通方法
    private void show(T t){

    }

    //TODO 泛型方法
    //TODO 在泛型类中声明一个泛型方法，使用泛型E,这种泛型E可以是任意类型
    //TODO 可以与T相同，也可以不同
    //TODO 由于泛型方法在声明的时候会声明泛型<E>，因此即使在泛型类中并未
    //TODO 声明泛型，编译器也能正常识别泛型方法中的泛型，比如：
    //TODO public class GenericMethod{
    //TODO    private <E>void show3(E t){
    //TODO    }
    //TODO }
    private <E>void show3(E t){

    }
}
