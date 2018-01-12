/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;
import LinkedLists.SelfLinkedList;

/**
 *
 * @author j
 */

//Implement a stack which supports the standard stack operations and a returnMax
//operation in O(1) time. O(n) additional space can be used.

public class StackWithMaxOperation {
    public static void main(String[] args) {
        SelfStack.MaxStack stk =new SelfStack().new MaxStack();
        stk.push(2);
        System.out.println("Current max should be 2. Result: " + stk.checkMax());
        stk.push(5);
        System.out.println("Current max should be 5. Result: " + stk.checkMax());
        stk.push(3);
        System.out.println("Current max should be 5. Result: " + stk.checkMax());
        stk.pop();
        stk.pop();
        System.out.println("Current max should be 2. Result: " + stk.checkMax());
        stk.pop();
        System.out.println("Current max should be -1 as stack empty. Result: " + stk.checkMax());
    }
    

}
