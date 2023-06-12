package DivideAndConquer_Asgn;

public class Kth_largest_Asgn {
    public static void main(String[] args) {
        int [] arr ={1,3,2,4,5,6,7};
        int k=3;
        System.out.println("Kth largest element is : " + Quickselect(arr,0,arr.length-1,k));
    }

    private static int Quickselect(int[] arr, int l, int h, int k) {
        int m = divideAndConquer(arr,l,h);
        if (m==(k-1)) return arr[m];
        else if (m>(k-1)) return Quickselect(arr,l,m-1,k);
        else return Quickselect(arr,m+1,h,k);
    }

    private static int divideAndConquer(int[] arr, int l, int h) {
        int i=l,pivot=arr[l];
        for (int j = l+1; j <=h ; j++) {
            if (arr[j]>=arr[pivot]){
                i=i+1;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            int temp = arr[l];
            arr[l]= arr[i];
            arr[i]= temp;
        }
        return i;
    }
}
/* Ans of Q2-->  Time complexity of the Quick Select algorithm is ==  O(nlogn)
   Ans of Q3 --> Data structure is used in Quick Select algorithm   == Stack
   Ans of Q4 -->  Partitioning scheme is used in Quick Select algorithm ==
   Ans of Q5 -->  The worst-case time complexity of Quick Select algorithm  == O(n^2)
   Ans of Q6 --> In the Quick Select algorithm << "The first element" >> is chosen as the pivot element.
 */