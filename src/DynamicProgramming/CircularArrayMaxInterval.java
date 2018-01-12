/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;
import java.lang.Math;
/**
 *
 * @author j
 */
public class CircularArrayMaxInterval {
    public static void main(String[] args) {
        int[] A = new int[]{904,40,523,12,-335,-385,-124,481,-31};
        System.out.println(MaxInterval(A)[0]);
        System.out.println(MaxInterval(A)[1]);
        
        
    }
    
    private static int[] MaxInterval(int[] arr){
        int sum=0, maxSum=0, minSum=0, koth=0, maxI=0, minI=0, total=0;
        int circCand, nonCircCand;
        int[] ans = new int[2];
        
        for (int x : arr)
            total += x;
        
        for(int i=0; i<arr.length;i++){
            circCand = total - sum + maxSum;
            nonCircCand = arr[i] + sum - minSum;
            if(nonCircCand > koth && nonCircCand > circCand){
                koth = nonCircCand;
                ans[0] = minI;
                ans[1] = i;
            } else if (circCand > koth && circCand > nonCircCand) {
                koth = circCand;
                ans[0] = i;
                ans[1] = maxI;
            }
            
            //Whenever we use minSum, its in a noncircular array calculation.
            //We thus want it to be right exclusive. The index required is then
            // actually one larger. Since this sum includes everything up to i-1,
            // i is the appropriate index
            if(sum < minSum){
                minSum = sum;
                minI = i;
            }
            
            
            //Whenever we use maxSum, its in a circular array calculation so
            //we want this to be right inclusive. The sum includes everything 
            // up to i - 1
            if(sum > maxSum){
                maxSum = sum;
                maxI= i-1;
            }
            
            sum += arr[i];
        }
        
        
        return ans;
    }
    
    
}
