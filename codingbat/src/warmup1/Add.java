package warmup1;

public class Add {
    public static void main(String[] args){

       int result1 = AddSameNumber(2,3);
        int result2= AddSameNumber(2,2);
        System.out.println(result1);
       System.out.println(result2);


    }

    public static int AddSameNumber(int a, int b){

        if(a!=b){
            return a+b;

        }
        else{
            return(2* a+b);
        }
    }
}

/*
package warmup1;

public class Add {
    public static void main(String[] args){
    System.out.println(AddSameNumber(result));
    }
    public static int AddSameNumber(int a, int b){
        int result =a+b;

        if(a!=b){
            return result;

        }
        else{
            return(2* result);
        }
    }
}
}
*/