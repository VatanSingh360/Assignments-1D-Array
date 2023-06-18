import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ques_1 {
    public static void main(String[] args) {
        int [] arr= {2,7,11,15};
        int targrt =26;

        int [] res =  IdxSum(arr,targrt);
        System.out.println(Arrays.toString(res));
    }

    private static int[] IdxSum(int[] arr, int targrt) {
      int [] ans = new int[2];
        Map <Integer,Integer>hm = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if (hm.containsKey(targrt-arr[i])){
                ans[1]=i;
                ans[0]=hm.get(targrt-arr[i]);
            }
            hm.put(arr[i],i);
        }
        return ans;
    }
}




