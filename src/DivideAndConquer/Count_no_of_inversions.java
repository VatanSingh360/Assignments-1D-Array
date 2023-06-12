package DivideAndConquer;

import java.util.Arrays;

public class Count_no_of_inversions {
    public static void main(String[] args) {
        int [] arr = {5, 4, 3, 2, 1};
      int swaps=  mergesort(arr,0,arr.length-1);
        System.out.println("Swaps counts are : "+swaps);
    }

    private static int mergesort(int[] arr, int l, int h) {
        int count =0;
        if (l<h){
            int m = l+(h-l)/2;
        count +=    mergesort(arr,l,m);
            count += mergesort(arr,m+1,h);
            count += countOfInversion(arr,l,m,h);
        }
        return count;
    }

    private static int countOfInversion(int[] arr, int l, int m, int h) {
        int swap =0;
        int lsubarr[]= Arrays.copyOfRange(arr,l,m+1);
        int [] rsubarr= Arrays.copyOfRange(arr,m+1,h+1);
        int i=0,j=0,k=l;
        while (i<lsubarr.length&& j<rsubarr.length){
            if (lsubarr[i]<=rsubarr[j]) arr[k++]=lsubarr[i++];
            else {
                arr[k++]= rsubarr[j++];
                swap +=(m+1)-(l+i);
            }
        }
        while (i< lsubarr.length){
            arr[k++]=lsubarr[i++];
        }
        while (j<rsubarr.length){
            arr[k++]= rsubarr[j++];
        }
        return swap;
    }
}
