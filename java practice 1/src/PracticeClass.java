public class PracticeClass {
    public static void main(String[] args){
        printEvenNumbers(10);

        System.out.println("Hey yeswanth");
        int result1 = getSum(2, 3);
        System.out.println("The Sum of 2 and 3 is "  + result1);
        int result2 = getDiff(2, 3);
        System.out.println("The difference of 2 and 3 is "  + result2);
        int result3 = getProduct(2, 3);
        System.out.println("The Product of 2 and 3 is "  + result3);
        int result4 = getDivision(2, 3);
        System.out.println("The Division of 2 and 3 is "  + result4);
        printnumbers(9);

    }
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static int getDiff(int a, int b) {
        int differece = a - b;
        return differece;
    }
    public static int getProduct(int a, int b) {
        int product = a * b;
        return product;
    }
    public static int getDivision(int a, int b) {
        int division = a / b;
        return division;
    }
    public static void printnumbers(int n){
        for (int i=0; i<=n; i++){
            System.out.println(i);
        }
    }
    public static void printEvenNumbers(int j){
         if(j%2==0){
         System.out.println("");
         }

    }}
