import java.util.ArrayList;
import java.util.List;

public class Test1<T> {


    static class A {
    }

    interface B {

    }

    interface C {

    }

    static class D<T extends A & C & B> {
    }


    public static void main(String[] args) {

        ArrayList<String> strs = new ArrayList<>();

        if(strs instanceof ArrayList){}

        if(strs instanceof ArrayList<?>){}

   //     if(strs instanceof  ArrayList<String>){}

    }


}
