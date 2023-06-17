import java.util.Arrays;

public class Ques_5 {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3};
        int [] arr2 = {2,5,6};
        int [] farr  =new int[arr1.length+ arr2.length];
        Merged(arr1,arr2,farr);
        System.out.println(Arrays.toString(farr));
    }

    private static void Merged(int[] arr1, int[] arr2,int[] farr) {
        int i=0,j=0,k=0;
        while (i<arr1.length&& j<arr2.length){
            if (arr1[i]< arr2[j]) farr[k]=arr1[i++];
            else farr[k]=arr2[j++];
            k=k+1;
        }
        while (i< arr1.length){
            farr[k++]=arr1[i++];
        }
        while (j< arr2.length){
            farr[k++]=arr2[j++];
        }
    }
}
