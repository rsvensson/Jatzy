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
public class Dice {
    private int value = 1; // Value of the die
    private boolean roll = true; // Roll state - whether or not to roll the die
    
    public Dice(int v) { value = v; }
    
    public void setValue(int v)     { value = v; }
    public void setRoll(boolean r)  { roll = r; }
    public int getValue()           { return value; }
    public boolean doRoll()         { return roll; }
}
