///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Stacks;
//
///**
// *
// * @author j
// */
//
////Sort a stack using push, pop, peek and only allocate O(1) space explicitly 
//public class SortStack {
//    public static void main(String[] args) {
//        SelfStack s = new SelfStack();
//        
//        s.push(4);
//        s.push(9);
//        s.push(17);
//        s.push(3);
//        s.push(1);
//        
//        System.out.println("Highest point is left side. The result after "
//                            + "sorting is: " + sort(s));
//    }
//    
//    public static SelfStack sort(SelfStack s){
//        int first;
//        int second;
//        SelfStack partialResult;
//        
//        //empty stack
//        if(s.isEmpty()){return s;}
//        
//        first = (int) s.pop();
//        partialResult = sort(s);
//        
//        //if one element stack, just push element back and return. 
//        // If 2 or more elements, check if the first element is larger than 
//        // second. If it is, pop off the second then push the first element
//        // before recursively sorting it. Otherwise, just push the first element
//        // on the stack and return it
//        if(partialResult.peek()==null){
//            partialResult.push(first);
//            return partialResult;
//        } else {
//            second = (int) partialResult.peek();
//            if(first <= second){
//                partialResult.push(first);
//                return partialResult;
//            } else {
//                partialResult.pop();
//                partialResult.push(first);
//                sort(partialResult);
//                partialResult.push(second);
//                return partialResult;
//            }
//        }
//    }
//}
