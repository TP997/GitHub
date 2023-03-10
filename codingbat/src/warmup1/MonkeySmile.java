package warmup1;

public class MonkeySmile {
    public static void main(String[] args){
        System.out.println(Monkey(true,true));
        System.out.println(Monkey(false,false));
        System.out.println(Monkey(true,false));
        System.out.println(Monkey(false,true));




    }
    public static boolean Monkey(boolean aSmile, boolean bSmile){
        if(aSmile==true && bSmile==true){
            return true;
        }
        else if(aSmile==false && bSmile==false){
            return true;
        }
        else{
            return false;
        }
    }
}
