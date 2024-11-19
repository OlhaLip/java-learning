package lv.acodemy;

public class ExempleClass {
    public static void main (String [] args){
        sayHello();

        great("Olha");   // tolko "Olha" name
        great("Tonn");   // tolko "Olha" name
        great("Milka");   // tolko "Olha" name

        add (10, 15);   //ili

        int a=15;   // ili
        int b=20;
        System.out.println(add(a,b));

        System.out.println(add(11.52, 3.56));
            }
    public static void sayHello (){
        System.out.println("Hello!!!!");
    }

    public static void great(String name) {
        System.out.println("Hello," + name + "!");
    }
    public static int add (int a, int b) {
        int c = a + b;
        return c;
    }

        public static int add (double d, double f) {
                  return (int) (d + f);


    }
}
