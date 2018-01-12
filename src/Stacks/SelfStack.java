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
public class SelfStack extends SelfLinkedList{
    private SelfLinkedList top;
    private String name;

    public String getName() {
        return name;
    }
    
    SelfStack(){}
    
    SelfStack(String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    class EmptyStackException extends Exception{
        
    }
    public void push(Object o){
        SelfLinkedList newTop = new SelfLinkedList(o);
        newTop.setNext(top);
        top = newTop;
    }
    
    public Object pop(){
        Object temp = top.getKey();
        top = top.getNext();
        return temp;
    }
    
    public Object peek(){
        if(top==null){return null;}
        return top.getKey();
    }
    
    public boolean isEmpty(){
        return top==null;
    }
    
    public String toString(){
        String result = "";
        SelfLinkedList curr = top;
        while(curr!= null){
            result =  result + curr + " | ";
            curr = curr.getNext();
        }
        return result;
    }
    
    class MaxStack extends SelfStack{
        private SelfStack maxStack = new SelfStack();

        @Override
        public void push(Object o){
            if(top==null){
                top = new SelfLinkedList(o);
                maxStack.top = new SelfLinkedList(o);
                return;
            }
            SelfLinkedList oldTop = top;
            SelfLinkedList newTop = new SelfLinkedList(o);
            if((int) maxStack.top.getKey() < (int) o){
                SelfLinkedList oldMaxTop = maxStack.top;
                maxStack.top = newTop;
                maxStack.top.setNext(oldMaxTop);
            }
            top = newTop;
            top.setNext(oldTop);
            
        }

        @Override
        public Object pop(){
            if(top == null) { return null;}
            SelfLinkedList currentTop = top;
            if(top == maxStack.top){
                maxStack.top = maxStack.top.getNext();
            }
            top = top.getNext();
            return currentTop.getKey();
            
        }
        
        public int checkMax(){
            System.out.println("stack status: " + this);
            System.out.println("maxstack status: " + maxStack);
            if(top == null||maxStack.top==null) {
                return -1;
            }
            return (int) maxStack.top.getKey();
        }
    }
}

