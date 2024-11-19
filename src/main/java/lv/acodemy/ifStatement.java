package lv.acodemy;

public class ifStatement {
    public static void main(String[] args) {



        int number = 7;
        if (number % 2 == 0) {
            System.out.println("the number is even.");
        }
//    else {
//     System.out.println("the number is odd.");
//    }
        number = -5;
        if (number >= 0) {
            System.out.println("the number is positive");
        } else {
            System.out.println("the number is negative");
        }

        int marks = 68;
        if (marks >= 90) {
            System.out.println(" Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks < 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

        // task 1 check if a person is eligible to an alcohol;

        // Prompt the user to enter their age

        int age = 15;
        // Check if the person is eligible to drink
        if (age >= 18) {
            System.out.println("You are eligible to consume alcohol.");
        } else {
            System.out.println("You are not eligible to consume alcohol.");
        }
        // task 2 Chech if a number can be divided by 5;
        // Define a number to check
        int numberA = 17;  // You can change this value to test other numbers

        // Check if the number is divisible by 5
        if (numberA % 5 == 0) {
            System.out.println(numberA + " is divisible by 5.");
        } else {
            System.out.println(numberA + " is not divisible by 5.");
        }
        // task 3 Chech pass or fail
        // if score >=50 (pass) if other case (fail)
        int score = 30;
        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("fail");
        }

        // if else if
        // above 30 (it is hot) temperatura >20<30 i cold
        int temperature = 35;
        if (temperature >= 30) {
            System.out.println("hot");
        } else if (temperature >= 20) {
            System.out.println("norm");
        } else if (temperature < 20) {
            System.out.println("cold");
        }
        int temp = 10;
        if (temp >= 30) {
            System.out.println("It is hot");
        } else if (temp >= 15) {
            System.out.println("The weather is nice");
        } else if (temp < 20) {
            System.out.println(" It is cold");
        }

        // traffic light system Green > go / yellow -> slow down / red -> stop / String color; if (color.equale ("Green"))
        String color = "Red";  // Change this to "Yellow" or "Red" to test other cases

        // Check the color of the traffic light and perform the corresponding action
        if (color.equals("Green")) {
            System.out.println("Go");
        } else if (color.equals("Yellow")) {
            System.out.println("Slow down");
        } else if (color.equals("Red")) {
            System.out.println("Stop");
        } else {
            System.out.println("Invalid color");
        }


//        public static String calculateGrede( int marks) {
//            int marks = 68;
//            if (marks >= 90) {
//                return " Grade A";
//            } else if (marks >= 75) {
//                return "Grade B";
//            } else if (marks >= 50) {
//                return "Grade C";
//            } else if (marks < 40) {
//                return "Grade D";
//            } else {
//                return "Grade F";
//            }

        }


    }





