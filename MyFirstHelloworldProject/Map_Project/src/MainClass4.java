import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MainClass4 {
    public static void main (String[] args){
        Map<Integer,Integer> Details = ConcurrentHashMap<Integer,Integer>();
        Details.put(1,2);
        Details.put(2,3);
        System.out.println(Details);
    }
}
