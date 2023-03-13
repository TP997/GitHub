
package warmup1;
public class diff21 {
    public static void main(String[] args){
        System.out.println(Difference(3));
        }
    public static int Difference(int n){
        if(n<21){
            return 21-n;
        }
        else if (n>21){
            return 2*(n-21);
        }
        else{
            return 0;
        }
    }
}
