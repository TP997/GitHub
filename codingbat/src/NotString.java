public class NotString {
    public static void main(String[] args){
        String str=notstring("thanuja");
        System.out.println(str);
    }
    public static String notstring(String str){
       if (str.startsWith("not")){
            return str;
        }
        else{
            return "not " + str;
        }
    }
}
