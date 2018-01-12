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
public class SelfLinkedList {
    private SelfLinkedList head;
    private SelfLinkedList next;
    private Object key;

    
    public SelfLinkedList() {
    }
    
    
    public SelfLinkedList(Object... keys) {

        this.key = keys[0];
        SelfLinkedList current = this;
        for(int i=1;i<keys.length;i++){
            SelfLinkedList temp = new SelfLinkedList(keys[i]);
            current.next = temp;
            current = temp;
        }
        
        this.next = current;
        current.next = null;

    }
    
    public SelfLinkedList getHead() {
        return head;
    }

    public void setHead(SelfLinkedList head) {
        this.head = head;
    }

    public SelfLinkedList getNext() {
        return next;
    }

    public void setNext(SelfLinkedList next) {
        this.next = next;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public String toString(){
        
        return (String) this.key.toString();
    }
    
}
