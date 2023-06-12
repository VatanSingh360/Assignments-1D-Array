package DivideAndConquer;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {50,20,70,90,10,13,17,21};
        System.out.println("Array Before Applying Quick Sort :" + Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("Array After Applying Quick Sort :" + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int l, int h) {
        if (l<h){
            int mid = Divide(arr,l,h);
            quickSort(arr,l,mid-1);
            quickSort(arr,mid+1,h);
        }
    }

    private static int Divide(int[] arr, int l, int h) {
        int i=l,pivot=arr[l];
        for (int j=l+1;j<=h;j++){
            if (arr[j]<=pivot){
                // ^ assending order
                //(arr[j]>=pivot) decending order
                i=i+1;
                int temp=arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        int temp = arr[l];
        arr[l]= arr[i];
        arr[i]= temp;
        return i;
    }
}
