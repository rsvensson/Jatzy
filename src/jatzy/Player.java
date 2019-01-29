/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jatzy;

/**
 *
 * @author robsve
 */
public class Player {
    private int num = -1; // Player number. -1 indicates a non-playing player
    private int[] scores = new int[18]; // array for holding all the scores
    private boolean[] used = new boolean[18]; // array for checking if the score row has been used
    
    public Player(int n) { this.reset(); num = n;}
    
    public void reset() {
        num = -1;
        for (int i = 0; i < 18; i++) {
            scores[i] = 0;
            used[i] = false;
        }
        
        // Sets the rows for sum, bonus and total to true
        used[6] = true;
        used[7] = true;
        used[17] = true;
    }
    
    public void setNum(int n)                { num = n; }
    public void setScore(int score, int pos) { scores[pos] = score; }
    public void setUsed(boolean b, int pos)  { used[pos] = b; }
    public int getNum()                      { return num; }
    public int getScore(int pos)             { return scores[pos]; }
    public boolean isUsed(int pos)           { return used[pos]; }
}
