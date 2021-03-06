package p1;

import java.util.ArrayList;
import java.util.List;


public class BigPlate<T> extends AIPlate<T> {

    private List<T> items = new ArrayList<>(20);


    public BigPlate(){

    }

    @Override
    public void set(T t) {
        items.add(t);
    }

    @Override
    public T get(){
        int index = items.size() -1;
        if(index>= 0){
            return items.get(index);
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        return "p1.Plate{" +
                "items=" + items +
                '}';
    }
}
