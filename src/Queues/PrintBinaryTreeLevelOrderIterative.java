///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Queues;
//import BinaryTrees.SelfBinaryTree;
//
///**
// *
// * @author j
// */
//
////Print a binary tree in level order with one queue and O(1) additional storage.
////Without using recursion.
//public class PrintBinaryTreeLevelOrderIterative {
//    public static void main(String[] args) {
//       SelfBinaryTree a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
//       
//       a = new SelfBinaryTree(19);
//       b = new SelfBinaryTree(7);
//       c = new SelfBinaryTree(3);
//       d = new SelfBinaryTree(2);
//       e = new SelfBinaryTree(5);
//       f = new SelfBinaryTree(11);
//       g = new SelfBinaryTree(17);
//       h = new SelfBinaryTree(13);
//       i = new SelfBinaryTree(43);
//       j = new SelfBinaryTree(23);
//       k = new SelfBinaryTree(37);
//       l = new SelfBinaryTree(29);
//       m = new SelfBinaryTree(31);
//       n = new SelfBinaryTree(41);
//       o = new SelfBinaryTree(47);
//       p = new SelfBinaryTree(53);
//       
//       a.setLeft(b);
//       b.setLeft(c);
//       c.setLeft(d);
//       c.setRight(e);
//       b.setRight(f);
//       f.setRight(g);
//       g.setLeft(h);
//       a.setRight(i);
//       i.setLeft(j);
//       j.setRight(k);
//       k.setLeft(l);
//       k.setRight(n);
//       l.setRight(m);
//       i.setRight(o);
//       o.setRight(p);
//       
//       //Expect to see 19,7,43,3,11,23,47,2,5,17,37,53,13,29,41,31
//       levelOrderWalk(a);
//    }
//    
//    public static void levelOrderWalk(SelfBinaryTree r){
//        SelfQueue q = new SelfQueue();
//        q.enqueue(r);
//        
//        while(!q.isEmpty()){
//            SelfBinaryTree curr = (SelfBinaryTree) q.dequeue();
//            SelfBinaryTree left = curr.getLeft();
//            SelfBinaryTree right = curr.getRight();
//            
//            System.out.println(curr);
//            if(left!=null){q.enqueue(left);}
//            if(right!=null){q.enqueue(right);}
//        }
//    }
//}
