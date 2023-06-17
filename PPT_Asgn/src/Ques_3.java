public class Ques_3 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target=1;
        System.out.println("Element is present at Index : "+Index(arr,target));
    }

    private static int Index(int[] arr,int target) {
        int l=0,h=arr.length;
        while (l<=h){
            int mid = l+(h-l)/2;
            if (arr[mid]==target) return mid;
            else if (arr[mid]<target) l=mid;
            else h=mid;
        }
        return -1;
    }
}
