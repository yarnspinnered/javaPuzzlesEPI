///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package LinkedLists;
//import java.util.Arrays;
//import java.util.LinkedList;
///**
// *
// * @author j
// */
//
////use O(1) storage
//public class MergeTwoSortedLists {
//    public static void main(String[] args) {
//        LinkedList a;
//        LinkedList b;
//        
//        a = new LinkedList(Arrays.asList(new Integer[]{1,3,5,7}));
//        b = new LinkedList(Arrays.asList(new Integer[]{2,4,6,8}));
//
//        System.out.println(merge(a,b));
//    }
//    
//    public static LinkedList merge(LinkedList a, LinkedList b){
//        //Empty linked list should take O(1) space.
//        LinkedList result = new LinkedList();
//        
//
//        while(!a.isEmpty() & !b.isEmpty()){
//
//            int smallA = (int) a.getFirst();
//            int smallB = (int) b.getFirst();
//            
//            //Let the new linked list refer to the same objects in the earlier
//            //lists. Just update the old lists to stop referring to processed
//            //objects.
//            if(smallA<smallB){
//                
//                result.add(smallA);
//                a.remove();
//            } else {
//                
//                result.add(smallB);
//                b.remove();
//            }
//        }
//        
//        if(a.isEmpty() & b.isEmpty()){
//            return result;
//        } else if (a.isEmpty()){
//            result.addAll(b);
//        } else {
//            result.addAll(a);
//        }
//        return result;
//    }
//    
//    
//    
//   
//}
