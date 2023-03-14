package warmup1;

public class PostNeg {
    public static void main(String[] args){
    System.out.println(post(1,2,true));

        System.out.println(post(1,-2,true));

        System.out.println(post(1,2,false));

        System.out.println(post(1,-2,false));
    }
    //Given 2 int values,
    // return true if one is negative and one is positive.
    // Except if the parameter "negative" is true,
    // then return true only if both are negative.
    public static boolean post(int a,int b, boolean negative){
        if(negative==true){
            if(a<0 && b<0){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            if    ((a<0 && b>0)||(a>0 && b<0) ){
                return true;
            }
            else{
                return false;
            }
        }
    }

}
