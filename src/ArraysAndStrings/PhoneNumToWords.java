/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author j
 */
public class PhoneNumToWords {
    public static void main(String[] args) {
       HashMap<Integer, Set> hmap = new HashMap<Integer,Set>();
        
        
        Set a2= new HashSet (Arrays.asList(new String[]{"a","b","c"}));
        Set a3= new HashSet (Arrays.asList(new String[]{"d","e","f"}));
        Set a4= new HashSet (Arrays.asList(new String[]{"g","h","i"}));
        Set a5= new HashSet (Arrays.asList(new String[]{"j","k","l"}));
        Set a6= new HashSet (Arrays.asList(new String[]{"m","n","o"}));
        Set a7= new HashSet (Arrays.asList(new String[]{"p","q","r","s"}));
        Set a8= new HashSet (Arrays.asList(new String[]{"t","u","v"}));
        Set a9= new HashSet (Arrays.asList(new String[]{"w","x","y","z"}));
        
        hmap.put(2,a2);
        hmap.put(3,a3);
        hmap.put(4,a4);
        hmap.put(5,a5);
        hmap.put(6,a6);
        hmap.put(7,a7);
        hmap.put(8,a8);
        hmap.put(9,a9);

        System.out.println(numToWords(hmap, 223));
    }
    
    private static Set numToWords(HashMap hmap, int num){
        if(num < 10){
            return (Set) hmap.get(num);
        }
        int smallEnd = num%10;

        Set alphabets = (Set) hmap.get(smallEnd);
        Set bigEnd = numToWords(hmap, num/10);
        if(bigEnd==null){return alphabets;}
        if(alphabets==null){return bigEnd;}
        
        Set result = new HashSet();
                
        for (Object partial: bigEnd){
            for (Object alpha: alphabets){

                result.add((String)partial + (String) alpha);
            }
        }
        return result;
        
    }
}
