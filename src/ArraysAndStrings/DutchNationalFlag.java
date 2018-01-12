///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package ArraysAndStrings;
///**
// *
// * @author j
// */
//
////Given an array A and index i, sort the array such that all elements smaller than
////A[i] come first, followed by A[i] then elements larger than A[i] with O(1) space
////and O(|A|) time
//public class DutchNationalFlag {
//    
//    public static void main(String[] args) {
//        int[] arr1 = {2,3,7,4,6};
//        pivot(arr1,2);
//        for(int x:arr1){System.out.println(x);}
//    }
//    
//    private static void swap(int[] A, int i, int j){
//        int temp = A[i];
//        A[i] = A[j];
//        A[j] = temp;
//    }
//    
//    private static void pivot(int[] A, int idx){
//        int key = A[idx];
//        //between 0 and small are the smaller keys
//        int small = 0;
//        //between large and right end of array are the larger keys
//        int large = A.length - 1;
//        int middle = 0;
//
//        while(middle <= large){
//            if(A[middle] < key){
//                swap(A, middle, small);
//                small++;
//                middle++;
//            } else if (A[middle] == key) {
//                middle++;
//            } else {
//                swap(A, middle, large);
//                large--;
//            }
//            
//        }
//        
//    }
//}
