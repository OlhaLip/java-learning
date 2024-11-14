package lv.acodemy;

public class Practice {
    public static void main(String[] args){
        // распечатать цифры от 1 до 10   for
        //for


        // Цикл for для вывода чисел от 1 до 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even number is " + i);
        }
        System.out.println("Goes next!");

        //
//        for (int i=2;i++;)
//        { if (i%2==0){  // делится без остатка на 2
//            System.out.println(i);

            // Цикл for для вывода таблицы умножения на 9
            for (int i = 1; i <= 10; i++) {
                int result = 9 * i;  // Вычисляем произведение
                System.out.println("9 * " + i + " = " + result);  // Выводим результат
            }
        // Цикл for для вывода таблицы умножения на 9
        for (int i = 1; i <= 10; i++) {
            int result = 5 * i;  // Вычисляем произведение
            System.out.println("5 * " + i + " = " + result);  // Выводим результат

            //for (int i=1; i<=10; i++) {
              //System.out.println("5 *" + i + " = " + i*5);}
            }
        }
    }


