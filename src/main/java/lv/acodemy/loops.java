package lv.acodemy;

public class loops {
    public static void main(String[] args) {

        //java Loop

        //for

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits", "Burg"};  //создали массив
        for (int i=0; i <shoppingList.length; i++) {
            System.out.println("Current product is " + shoppingList[i]);
        }
        System.out.println("Goes next!");

        //for-each
          //создали массив
        for (String s : shoppingList) {
            System.out.println("Current product is " + s);
        }
        System.out.println("Goes next!");

        //while
        int i=0;
        while (i <shoppingList.length) {
            System.out.println("Current product is " +shoppingList[1]);
            i++;
        }

        //do - while
        do {
            System.out.println("Current product is " + shoppingList[1]);
            i++;
        } while (i <shoppingList.length);

        ///
        boolean x=1 <5 && 6>3; //&& все условия правда
        boolean y=2 > 5 || 3<2; // or
        System.out.println(x);
        System.out.println(y);



        }
    }

