public class MissingChar {
    public static void main(String[] args){
        String str=missing("thanuja",1);
        System.out.println(str);

    }
    public static String missing(String str, int n){
        return str.substring(0, n) + str.substring(n+1);

    }
}
