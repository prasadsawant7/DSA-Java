package com.company;

public class DSA_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,-4,0,-1,9,99,10,6,-2};
        int n = arr.length;
        bubbleSort(arr, n);
    }
    public static void bubbleSort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            boolean isSorted = true;
            for(int j=0; j<n-1-i; j++){
                if(arr[j+1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    isSorted = false;
                }
            }
            if(isSorted) break;
        }
        for(int e: arr){
            System.out.print(e + " ");
        }
    }
}