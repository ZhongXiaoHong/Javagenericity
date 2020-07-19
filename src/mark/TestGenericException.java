package mark;
//
//public class TestGenericException<T> extends Exception {
//}
//
//
//class TestGenericException2<T> extends Throwable {
//}


public class TestGenericException<T>  {


//    public <T extends  Throwable> void dosth(){
//        try {
//
//        }catch (T t){
//
//        }
//
//    }


    public <T extends  Throwable> void dosth2(T t) throws T{
        try {

        }catch (Throwable e){
            throw t;
        }

    }
}