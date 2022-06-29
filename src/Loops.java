class Calc{
    // varargs
    public int add(int ... n){
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }
    public void dis(){
        int [][]a  = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        // 2-D array print using foreach
        for (int i[]:a){
            for (int j : i){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
public class Loops {


    public static void main(String[] args) {
        /*int j = 1;
        while (j <= 10){
            System.out.println(j);
            j++;
        }
        for (int i = 0 ; i < 5; i++)
        {
            System.out.println(i+"For");
        }
        j = 1;
        do {
            System.out.println(j+"do");
            j++;
        }while (j <= 10);

        int [] e = {2,1,3,4,5,6,4};
        for (int i : e){
            System.out.print(i+" ");
        }*/



//        for(int i = 1;i <= 5; i++){
//            for (int j = 1; j <= i ; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (char ch = 'A'; ch <= 'C';ch++){
//            for (char k = 'A' ; k <= ch;k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }


        Calc ref = new Calc();
        System.out.println(ref.add(3,3,2,2,2));
        ref.dis();
    }
}
