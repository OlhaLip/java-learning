package lv.acodemy;

public class Variables {
    public static void main(String[] args) {


        // this is my comment
        /*
        this is firs line
        this is second line
         */

        // int (integer) - natural number
        int age = 30;
        int currentYear = 2024;
        int inventoryIteamCount = 100;
        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryIteamCount);

        //double (drobnie number)
        double temperature = 36.6;
        double price =19.99;
        double distance = 384123456816.0d;
        System.out.println(temperature);
        System.out.println(price);
        System.out.println(distance);

        //char
        char grade = 'A';
        char myInitial ='L';
        char curencySymbol= '$';
        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(curencySymbol);

        // boolean (true / false) has or is
        boolean hasAccess = true;
        System.out.println(hasAccess);
        boolean isSummer = false;
        System.out.println(isSummer);

        System.out.println( "hello world\n");
        //long
        long phoneNumber = 25448960;

        // float
        float interestRate = 4.5f;

        // Arithmatic operators

        int a =10;
        int b =5;
        int sum = a + b;
        System.out.println(sum);

        int c =20;
        int d =5;
        int different = d - c;
        System.out.println(different);

        int m = 7;
        int n = 8;
        int result = 7*8;
        System.out.println(result);

        //divide

        int num1 =10;
        int num2 =3;
        int divisin = num1/num2;

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult = num3/num4;
        System.out.println(divResult);

        // % (remainder of a division)
        int f =12;
        int g =5;
        int remainder = f % g; //10=3*3+1
        System.out.println(remainder);

        int number =8;
        boolean isEven =(number %2 == 0); // cravnenie ne priravnivanie
        System.out.println(isEven);

        // increment ++ uvilichivaen na 1
        // ++preIncrement
        // decriment --
        // ++decrement
        number ++;
        System.out.println(number);
        number --;
        System.out.println(number);

        int counter =10;
        counter ++;
        int postIncrement = counter++; // 11;12
        int preIncrement = ++ counter;
        System.out.println(postIncrement);
        System.out.println(preIncrement);




    }


    }

