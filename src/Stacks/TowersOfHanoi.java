/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

/**
 *
 * @author j
 */
public class TowersOfHanoi {
    static SelfStack P1 = new SelfStack("P1");
    static SelfStack P2 = new SelfStack("P2");
    static SelfStack P3 = new SelfStack("P3");
    
    public static void main(String[] args) {
        P1.push(5);
        P1.push(4);
        P1.push(3);
        P1.push(2);
        P1.push(1);
        
        TowerHanoi(P1, P2, P3, 5);
        
        System.out.println(P1);
        System.out.println(P2);
        System.out.println(P3);
    }
    
    public static void TowerHanoi(  SelfStack Source,
                                    SelfStack Intermediate,
                                    SelfStack Goal,
                                    int move_count){

        if(move_count == 1){

            Object temp = Source.pop();
            Goal.push(temp);
            System.out.println("Move " + temp.toString() + " from " + 
                    Source.getName() + " to " + Goal.getName());

            return ;
        }
        TowerHanoi(Source, Goal, Intermediate, move_count - 1);
        Object temp = Source.pop();
        Goal.push(temp);
        System.out.println("Move " + temp.toString() + " from " + 
                    Source.getName() + " to " + Goal.getName());
        TowerHanoi(Intermediate, Source, Goal, move_count - 1);
    } 
}

