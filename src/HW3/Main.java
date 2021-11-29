package HW3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String arr2[] = {"A", "B", "C"} ;
        swap(arr1,2,3);
        swap(arr2,0,1);

        //Задание 3
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("Задача 3");
        System.out.println("'g' - addFruit: ");
        or.addFruit(new Orange(),4);
        or1.addFruit(new Orange(),16);
        ap.addFruit(new Apple(),7);
        ap1.addFruit(new Apple(),10);
        System.out.println("Box 1: " + or.getWeight());
        System.out.println("Box 2: " + or1.getWeight());
        System.out.println("Box 3: " + ap.getWeight());
        System.out.println("Box 4: " + ap1.getWeight());
        System.out.println("'e' - compare(): ");
        System.out.println("Box 1 equals box 3: " + or.compare(ap));
        System.out.println("Box 2 equals box 4: " + or1.compare(ap1));
        System.out.println("'f' - pourTo(): ");
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println("'d' - getWeight(): ");
        System.out.println("Box 1: " + or.getWeight());
        System.out.println("Box 2: " + or1.getWeight());
        System.out.println("Box 3: " + ap.getWeight());
        System.out.println("Box 4: " + ap1.getWeight());

    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Задание 1: " + Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Результат перемещения: " + Arrays.toString(arr)+"\n================================");
    }
}
