package Necklace;

import Stones.Stone;

import java.util.ArrayList;


public class Necklace {

    private ArrayList<Stone> stonesList = new ArrayList<>();

    public Necklace (){

    }

    public ArrayList<Stone> getList() {
        return stonesList;
    }

    public void setStonesList(ArrayList<Stone> stonesList) {
        this.stonesList = stonesList;
    }

    @Override
    public String toString() {
        return ("\nNecklace:\n" + stonesList);
    }
}
