/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;
import java.lang.Math;
/**
 *
 * @author j
 */
public class AddStringIntegers {
    public static void main(String[] args) {
        
        System.out.println(addStringInt("129","456"));
    }
    
    private static String addStringInt(String a, String b){
        String result = "";
        int current;
        int carryOver = 0;
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        int shorterLength = Math.min(arrA.length, arrB.length);
        
        for(int i=0; i < shorterLength; i++){
            current = Character.getNumericValue(arrA[arrA.length-i - 1]) 
                    + Character.getNumericValue(arrB[arrB.length-i - 1])
                    + carryOver;
            carryOver = current/10;
            result = current%10 + result;
        }
        
        return result;
    }
}
