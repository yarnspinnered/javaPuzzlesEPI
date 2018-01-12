/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;
import LinkedLists.SelfLinkedList;

/**
 *
 * @author j
 */
public class SelfQueue extends SelfLinkedList{
    private SelfLinkedList head;
    private SelfLinkedList tail;

    public Object dequeue(){
        if(head==null){return null;}
        SelfLinkedList oldHead = head;
        head = oldHead.getNext();
        return oldHead.getKey();
    }
    
    public void enqueue(Object o){
        SelfLinkedList temp = new SelfLinkedList(o);
        if(head==null){
            head=temp;
            tail=temp;
            return;
        }
        tail.setNext(temp);
        tail = temp;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
}
