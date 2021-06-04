package com.company;

public class DSA_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10,-3,0,12,4,19,7};
        int n = arr.length;
        selectionSort(arr, n);
    }
    public static void selectionSort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for(int e: arr){
            System.out.print(e + " ");
        }
    }
}