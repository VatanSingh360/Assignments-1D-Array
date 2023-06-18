import java.util.HashMap;
import java.util.Map;


public class Ques_6 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,1};
       boolean ch = chkDupli(arr);
       if (!ch) System.out.println("false");
       else System.out.println("true");
    }

    private static boolean chkDupli(int[] arr) {
        Map<Integer,Integer> hm = new HashMap<>();
        for (int x:arr) hm.put(x,hm.getOrDefault(x,0)+1);
        for(Map.Entry<Integer,Integer> m :hm.entrySet()){
            if (m.getValue()>1) return true;
        }
       return false;
    }
}
