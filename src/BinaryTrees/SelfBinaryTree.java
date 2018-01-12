/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTrees;

/**
 *
 * @author j
 */
public class SelfBinaryTree {
    private SelfBinaryTree left;
    private SelfBinaryTree right;
    private Object key;
    
    public SelfBinaryTree(){}
    
    public SelfBinaryTree(Object key){
        this.key = key;
    }

    public SelfBinaryTree getLeft() {
        return left;
    }

    public void setLeft(SelfBinaryTree left) {
        this.left = left;
    }

    public SelfBinaryTree getRight() {
        return right;
    }

    public void setRight(SelfBinaryTree right) {
        this.right = right;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }
    
    public String toString(){
        return key.toString();
    }
    
}
