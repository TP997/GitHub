public class ParrotTrouble {
    public static void main(String[] args){
        System.out.println(Parrot(true,4));
        System.out.println(Parrot(false,4));
        System.out.println(Parrot(true,8));


    }

    public static boolean Parrot(boolean talking, int hour) {


        if (talking == true && (hour < 7 || hour > 20)){
            return true;
        }
        else{
            return false;
        }
    }
}
