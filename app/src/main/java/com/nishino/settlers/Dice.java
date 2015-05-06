package com.nishino.settlers;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by nish on 5/6/15.
 */
public class  Dice {
    int sides;
    int numOfDice;
    ArrayList<Integer> rollHistory;

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getNumOfDice() {
        return numOfDice;
    }

    public void setNumOfDice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public ArrayList<Integer> getRollHistory() {
        return rollHistory;
    }


    public Dice(int sides, int numOfDice)
    {
        this.sides = sides;
        this.numOfDice = numOfDice;
        this.rollHistory = new ArrayList<Integer>();

    }

    public Integer getLastRoll(){
        return this.rollHistory.get(this.getRollHistory().size()-1);
    }

    public Integer roll()
    {
        int total = 0;
        Random rand = new Random();
        for(int x=0; x < numOfDice; x++)
        {
            total += rand.nextInt(this.sides) + 1;
            rollHistory.add(total);
        }
        return total;
    }
}
