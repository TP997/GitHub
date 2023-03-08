public class opeartions {
    public static void main(String[] args){
        for(int i=1;i<7;i++)
        {
            System.out.println("thanuja");

        }

        int result1 = getSum(2, 3);
        System.out.println("The Sum of 2 and 3 is "  + result1);


    int result2= getRemainder(5,5);
    System.out.println("remainder" + result2);
    }
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;

    }
    public static int getRemainder(int c, int d){
     int Remainder=c % d;
     return Remainder;
    }

}
