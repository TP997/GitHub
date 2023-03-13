public class NearHunderad {
    public static void main(String[] args){
        System.out.println(Hundred(89));
        System.out.println(Hundred(101));

    }
    //Given an int n,
    // return true if it is within 10 of 100 or 200.
    // Note: Math.abs(num) computes the absolute value of a number.
    public static boolean Hundred(int n){
        if(Math.abs(n-100)<=10 || Math.abs(n-200)<=10){
            return true;
        }
        else{
            return false;
        }


    }
}
