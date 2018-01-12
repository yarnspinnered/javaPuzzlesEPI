/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

/**
 *
 * @author j
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{431,-15,639,342,-14,565,-924,635,167,-70};
        
        int sum = 0;
        int minSum = 0;
        
        for (int x=9; x >= 0; x--){
            sum+=arr[x];
            System.out.print("Prefix sum: " + sum + ". Min Sum: ");
            System.out.println(minSum + " , ");
            if(sum>minSum){minSum = sum;}
        }
    }
}
