/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

/**
 *
 * @author j
 */
public class CheckCycle {
    public static void main(String[] args) {
        SelfLinkedList a,b,c,d;
        
        a = new SelfLinkedList(1);
        b = new SelfLinkedList(2);
        c = new SelfLinkedList(3);
        d = new SelfLinkedList(4);
        
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(a);
        
        System.out.println("Cyclical list test case. Result: " + check(a));
        
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(null);
        System.out.println("Noncyclical list test case. Result: " + check(a));
    }
    
    public static Object check(SelfLinkedList l){
        SelfLinkedList a;
        SelfLinkedList b;
        int step = 0;
        
        if((l.getNext() != null && l.getNext().getNext()!=null )){
            a = l.getNext();
            b = l.getNext().getNext();
        } else {
            return null;
        }
        
        while(a != null && b!=null ){
            if(a==b){
                return a;
            }
            a = a.getNext();
            b = b.getNext().getNext();
            
        }
        
        return null;
        
        
        
        
    }
}
