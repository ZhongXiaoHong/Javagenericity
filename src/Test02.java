import p1.*;

public class Test02 {

    public static void main(String[] args) {

        Plate<Apple> a1 = new AIPlate<Apple>();
        Plate<Apple> a2 = new BigPlate<Apple>();

        Plate<Apple> a3 = new ColorPlate<String,Apple>();


        Plate<?super Fruit> fruitPlate = new AIPlate<Food>();//TODO  允许这么操作

        fruitPlate.set(new Apple());//TODO  允许写
<<<<<<< HEAD
       // fruitPlate.set(new p1.Food());//TODO  允许写
=======
     //   fruitPlate.set(new Food())//TODO  允许写
>>>>>>> 044aef55b14d753836b22a66fe4fe8ab636e11cf



    }
    

}
