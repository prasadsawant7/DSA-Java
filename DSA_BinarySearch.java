package com.company;

import java.util.Scanner;

public class DSA_BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        System.out.println(binSearchRecursive(arr,0,n-1,x));
        System.out.println(binsearchIterative(arr,x));
    }
//  Recursive Approach
    public static int binSearchRecursive(int[] arr, int left, int right, int x){
        if(left>right){
            return -1;
        }
        int mid = (left+right)/2;
        if(arr[mid] == x){
            return mid;
        }
        else if(x < arr[mid]){
            return binSearchRecursive(arr, left, mid-1, x);
        }
        else{
            return binSearchRecursive(arr, mid+1, right, x);
        }
    }

//  Iterative Approach
    public static int binsearchIterative(int[] arr, int x){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + ((right-left)/2); // To overcome overflow issue
            if(arr[mid]==x){
                return mid;
            }
            else if(x < arr[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }
}