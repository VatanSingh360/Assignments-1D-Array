package DivideAndConquer;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,11,21,31};
        System.out.println("Before Merg Sort : "+ Arrays.toString(arr));
        MergeSort(arr,0,arr.length-1);
        System.out.println("Here it is -----");
        printArr(arr);
       // System.out.println("After Sorting : "+Arrays.toString(arr));
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void MergeSort(int[] arr, int l, int r) {
        if (l<r){
            int mid = l+(r-l)/2;
            MergeSort(arr,l,mid);
            MergeSort(arr,mid+1,r);
            MergingArr(arr,l,mid,r);
        }
    }

    public static void MergingArr(int[] arr, int l, int mid, int r) {
        int i,j,k;
        int n1= mid-l+1,n2=r-mid;
        int [] lsubArr = new int[n1];
        int [] rsubArr = new int[n2];

        for ( i = 0; i < n1; i++) lsubArr[i]= arr[l+i];

        for ( j = 0; j < n2; j++) rsubArr[j]=arr[mid+j+1];
        i=0;
        j=0;
        k=l;
        while (i<n1&&j<n2){
            if (lsubArr[i]<=rsubArr[j]){
                arr[k]= lsubArr[i];
                i=i+1;
            }
            else{
                arr[k]= rsubArr[j];
                j=j+1;
            }
            k=k+1;
        }

        while (i<n1){
            arr[k]= lsubArr[i];
            i = i+1;
            k=k+1;
        }
        while (j<n2){
            arr[k]= rsubArr[j];
            j=j+1;
            k=k+1;
        }

    }
}
