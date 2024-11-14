package lv.acodemy;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        // Arrays
        int[] numbers;
        String[] names;

        // not recommended (не рекомендуется использовать такие объявления)
        int number[];
        String name[];

        numbers = new int[5];
        names = new String[3];

        // Пример инициализации массивов
        int[] numberz = {1, 2, 3, 4, 5};
        String[] namez = {"jonn", "Alex", "Marry", "Doe"};

        // Выводим имя "Marry"
        System.out.println(namez[2]);

        // Меняем значение на "Jerry"
        namez[2] = "Jerry";

        // Выводим обновленный массив
        System.out.println(Arrays.toString(namez));

        String myName = "John";
        myName.charAt(1);
        System.out.println(myName.charAt(0));


    }
}


