package com.company;

import java.util.Scanner;

// Time Complexity - O(n)
// Space Complexity - O(1)

public class DSA_LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        System.out.println("At index " + search(arr, n, x));
    }
    public static int search(int[] arr, int n, int x){
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return  -1;
    }
}