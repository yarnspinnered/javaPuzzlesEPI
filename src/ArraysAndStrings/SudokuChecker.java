/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;
import java.lang.Math;
/**
 *
 * @author j
 */
public class SudokuChecker {
    public static void main(String[] args) {
        int[][] board = new int[9][9];
        
        board[0] = new int[]{5,3,0,0,7,0,0,0,0};
        board[1] = new int[]{6,0,0,1,9,5,0,0,0};
        board[2] = new int[]{0,9,8,0,0,0,0,6,0};
        board[3] = new int[]{8,0,0,0,6,0,0,0,3};
        board[4] = new int[]{4,0,0,8,0,3,0,0,1};
        board[5] = new int[]{7,0,0,0,2,0,0,0,6};
        board[6] = new int[]{0,6,0,0,0,0,2,8,0};
        board[7] = new int[]{0,0,0,4,1,9,0,0,5};
        board[8] = new int[]{0,0,0,0,8,0,0,7,9};

        System.out.println(checkBoard(board));
        
    }
    
    private static boolean checkBoard(int[][] board){
        boolean[][] rowChecks = new boolean[9][9];
        boolean[][] colChecks = new boolean[9][9];
        boolean[][] boxChecks = new boolean[9][9];
        
        for(int i=0; i<board.length;i++){
            for(int j=0; j<board.length;j++){
                int x = board[i][j] - 1;
                int box = i/3*3 + j/3;
                if(x != -1){
                    if(rowChecks[i][x] | colChecks[j][x] | boxChecks[box][x]){
                        System.out.println(rowChecks[i][x]);
                        System.out.println(colChecks[j][x]);
                        System.out.println(boxChecks[box][x]);
                        System.out.println("i " + i + "j " + j);
                        return false;
                        
                    } else {
                        System.out.println("Setting i " + i + " .j " + j + " .x " + x + " box " + box);
                        rowChecks[i][x] = true;
                        colChecks[j][x] = true;
                        boxChecks[box][x] = true;
                    }
                }
            }
        }
        
        return true;
    }
}
