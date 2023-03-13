public class Makes10 {
    public static void main(String[] args){
       System.out.println(Makes(5,5));
        System.out.println(Makes(5,6));
        System.out.println(Makes(0,10));


    }

   // Given 2 ints, a and b, return true if one if them is 10
  //  or if their sum is 10.
    public static boolean Makes(int a, int b){
        if((a== 10 || b==10) || (a+b==10)){
            return true;
        }

        return false;
    }
}
