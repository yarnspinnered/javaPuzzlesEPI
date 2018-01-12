/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;
import java.lang.Math;
/**
 *
 * @author j
 */

/* Given two lists which may or may not overlap, i.e. one of the nodes in list a
 * connects to list b, find the first node that appears in both lists. If there
 * is no such node, return null. assume lists are finite and are not cyclical.
 */

public class OverlappingLists {
    public static void main(String[] args) {
        SelfLinkedList a,b,c,d,e,f,g;
        
        a = new SelfLinkedList(1);
        b = new SelfLinkedList(2);
        c = new SelfLinkedList(3);
        d = new SelfLinkedList(4);
        e = new SelfLinkedList(5);
        f = new SelfLinkedList(6);
        g = new SelfLinkedList(7);
        
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        
        f.setNext(g);
        g.setNext(b);
        
        System.out.println("Overlapping at node 2 case: " + checkOverlap(a,f));
        
        g.setNext(null);
        System.out.println("Not overlapping case: " + checkOverlap(a,f));
    }
    
    private static Object checkOverlap(SelfLinkedList a, SelfLinkedList b){
        SelfLinkedList currentA=a;
        SelfLinkedList currentB=b;
        SelfLinkedList longerList;
        int aLength = 1;
        int bLength = 1;
        int diff = 0;
        
        if(a==null||b==null){return null;}
        
        //first pass
        while(currentA.getNext()!=null){
            currentA= currentA.getNext();
            aLength++;
        }
        while(currentB.getNext()!=null){
            currentB= currentB.getNext();
            bLength++;
        }
        
        if(currentA!=currentB){return null;}
        
        //reset pointers to start
        currentA = a;
        currentB = b;
        
        //advance the pointer on the longer linked list to same distance from 
        //end
        if (aLength>bLength){
            diff = aLength - bLength;
            for(int i = 0; i < diff; i++){currentA=currentA.getNext();}
            
        } else {
            diff = bLength - aLength;
            for(int i = 0; i < diff; i++){currentB=currentB.getNext();}
        }
        
        while(currentA!= null){
            if(currentA != currentB){
                currentA = currentA.getNext();
                currentB = currentB.getNext();
            } else {
                return currentA;
            }
        }
        
        return null;
    }
}
