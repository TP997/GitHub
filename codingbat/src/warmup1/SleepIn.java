

package warmup1;

public class SleepIn {
    public static void main(String[] args){

        /*
       boolean ans1= SleepIn(false, false);
        boolean ans2= SleepIn(true, false);
        boolean ans3= SleepIn(false, true);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        */

        System.out.println(SleepIn(false, false));
        System.out.println(SleepIn(true, false));
        System.out.println(SleepIn(false, true));



    }
/*
The parameter weekday is true if it is a weekday,
 and the parameter vacation is true if we are on vacation.
 We sleep in if it is not a weekday or we're on vacation.
 Return true if we sleep in.
*/
    public static boolean SleepIn(boolean weekday,boolean vacation){
        if(weekday==false || vacation==true) {
            return true;
        }
            else{
                return false;
            }

    }
}
