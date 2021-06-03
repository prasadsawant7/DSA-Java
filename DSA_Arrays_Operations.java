package com.company;
import java.util.Arrays;

public class DSA_Arrays_Operations {
    public static void main(String[] args) {
        // Deletion
        int[] arr = {12,1,35,20,100,15,99,101,123};
        int[] dparr = new int[arr.length-1];
        int index = 4;
        for(int k : arr) {
            System.out.print(k + "\t");
        }
        System.out.println();
        for(int i=0, k=0; i<arr.length; i++) {
            if(i==index){
                continue;
            }
            dparr[k++] = arr[i];
        }
        System.out.println(Arrays.toString(dparr));
    }
}