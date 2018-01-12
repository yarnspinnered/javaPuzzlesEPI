///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package ArraysAndStrings;
//import java.lang.Math;
///**
// *
// * @author j
// */
//
////Given a robot that only uses energy to go uphill and recovers the same amount
////of energy when going down the same height downhill, what is the battery 
////capacity required for the robot? *Going forward on flat ground uses no energy
//public class MaxDifference3D {
//    
//    public static void main(String[] args) {
//        double[] p1 = {0,0,8};
//        double[] p2 = {2,7,3};
//        double[] p3 = {4,1,20};
//        double[] p4 = {2,3,4};
//        double[] p5 = {2,3,30};
//        
//        System.out.println(capacity(p1,p2,p3,p4,p5));
//        
//    }
//    
//    public static double capacity(double[]... args){
//        double min = args[0][2];
//        double capacity = 0;
//        
//        for(double[] x: args){
//            min = Math.min(x[2], min);
//            capacity = Math.max(capacity, x[2] - min);
//        }
//        return capacity;
//    }
//}
