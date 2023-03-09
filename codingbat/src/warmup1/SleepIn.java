/*
The parameter weekday is true if it is a weekday,
 and the parameter vacation is true if we are on vacation.
 We sleep in if it is not a weekday or we're on vacation.
 Return true if we sleep in.
*/


package warmup1;

public class SleepIn {
    public static void main(String[] args){

        SleepIn(true,false);
        SleepIn(false,true);
        SleepIn(true,true);
        SleepIn(false,false);


    }

    public static boolean SleepIn(boolean weekday,boolean vacation){
        if(!weekday && vacation) {
            System.out.println("sleepin");
            return true;
        }
            else{
                System.out.println("dont sleep");
                return false;
            }

    }
}
