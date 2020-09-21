import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Main {





    public static void main(String[] args){
//        System.out.println(Arrays.toString(swap(0,4, arrText)));

        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        appleBox.addInBox(8, new Apple("Яблоко"));
        orangeBox.addInBox(5, new Orange("Апельсин"));


        System.out.println(appleBox);
        System.out.println(orangeBox);


        System.out.println(appleBox.getWeight(12, Apple.wtApple));
        System.out.println(orangeBox.getWeight(4, Orange.wtOrange));


       appleBox2.movingFruits(appleBox);
       System.out.println(appleBox2 + " END");

    }


    // Первое задание:
    public static Object[] swap(int i, int j, Object[] swapArr){
        Object x = swapArr[i];
        swapArr[i] = swapArr[j];
        swapArr[j] = x;
        return swapArr;
    }

    // Второе задание:
    public static <T> void arrToArrayList(T[] arr){
        ArrayList<T> arrToAL = new ArrayList<>(Arrays.asList(arr));
        return;
    }


}
