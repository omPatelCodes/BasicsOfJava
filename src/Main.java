public class Main {
    public static void main(String[] args) {
        // print
        System.out.println("Hello World!!! ");

        /*variable , datatype , if-else , loop ,
         this . super , static , inner , outer , array ,
         for-each , varargs , inheritance , dynamic method dispatch ,
         final, abstract , interface
         */

/*
//      variable
        int          a          =   44;
//      datatype     var_name       value

//      if-else
        if (a > 18){
            System.out.println("you can drive");
        }
        else if (a == 18){
            System.out.println("discuss about uuu");
        }
        else {
            System.out.println("you can't drive");
        }

//      Loops
        int i = 1;
        System.out.println("While");
        while (i <= 10){
            System.out.print(i+" ");
            i++;
        }
        i = 1;
        System.out.println("\nFor");
        for (;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println("\nDo-While");
        do {
            System.out.print(i+" ");
            i++;
        }while (i<= 10);
*/
//      class-obj
//        Example ex = new Example2(); //dynamic method dispatch
//        Example ex1 = new Example();
//        Example ex2 = new Example(4,2);
//        Example2 ex3 = new Example2();
//        Example2 ex4 = new Example2(5,3);
//        Example2.Baby ref = ex4.new Baby(); // inner class access

//        Calc c = new Calc();
//        System.out.println(c.add(4,4,2,2));

        // final
        int a = 33;
        final int b = 3;
        System.out.println(a+" "+b);
        a = 55;
//        b = 33; // doesn't change
        System.out.println(a+" "+b);
    }


}
// this , super , inner , outer ---> all in below class
class Example{ // outer
    int a , b;
    Example(){
        System.out.println("nothing from Example");
    }
    Example(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println(a+" "+b);
    }
}
class Example2 extends Example{
    int x,y;
    public Example2(){
        System.out.println("Nothing from Example2");
    }
    Example2(int x,int y){
        super(4,5);
        this.x = x;
        this.y = y;
        System.out.println(x+" "+y);
    }
    class Baby{
        Baby(){
            System.out.println("inner");
        }
    }
}
class calc{
    public int add(int ... a){
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        return sum;
    }
}
abstract class animal{
    abstract void eat();
    abstract void speak();
    abstract void listen();
    abstract void gender();
    public void walk() {
        System.out.println("Yes every Animal walk with 4 leg");
    }
}
interface Animal{
    // abstract + public
    // only contain abstract method.
    void eat();
    void speak();
    void listen();
    void gender();
    default void walk(){
        System.out.println("Yup...");
    }
}
class ForAbsInter implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog Eat veg + non-veg");
    }

    @Override
    public void speak() {
        System.out.println("Bhaw bhaw...");
    }

    @Override
    public void listen() {
        System.out.println("listen very harsly...");
    }

    @Override
    public void gender() {
        System.out.println("Also male or female");
    }
}

