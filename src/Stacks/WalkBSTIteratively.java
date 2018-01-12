///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Stacks;
//import BinaryTrees.SelfBinaryTree;
///**
// *
// * @author j
// */
//
////Print the keys of the BST in a sorted manner without recursion
//public class WalkBSTIteratively {
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
//       iterWalk(a);
//    }
//    
//    public static void iterWalk(SelfBinaryTree r){
//        SelfBinaryTree curr = r;
//        SelfStack stk = new SelfStack();
//        stk.push(r);
//        
//        while(!stk.isEmpty()){
//            if(curr!=null){
//                curr = curr.getLeft();
//                stk.push(curr);
//            }else {
//                stk.pop();
//                curr = (SelfBinaryTree) stk.pop();
//                System.out.println(curr);
//                if(stk.isEmpty()){break;}
//                stk.push(curr.getRight());
//                curr = curr.getRight();
//            }
//            
//        }
//    }
//    
//}
