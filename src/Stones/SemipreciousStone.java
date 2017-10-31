package Stones;

import Stones.StoneParameters.ClarityType;
import Stones.StoneParameters.GemCuttingType;
import Stones.StoneParameters.SemiPreciousStoneList;

public class SemipreciousStone extends Stone{

    private SemiPreciousStoneList name;

    public SemipreciousStone (SemiPreciousStoneList name, double stoneWeight, double stonePricePerCarat, GemCuttingType gemCuttingType, ClarityType clarityType){
        super(stoneWeight,stonePricePerCarat, gemCuttingType, clarityType);
        this.name = name;
    }

    public SemiPreciousStoneList getName() {
        return name;
    }


    @Override
    public String toString() {
        return ("\n Name: " + this.getName() +"| Weight: " + String.format("%.2f",this.getWeight()) + " Ct |" + " Price: " +"$ "+ String.format("%.2f",this.getPrice()) +
                " | "+ " Gem Cut Type: " + this.getGemCuttingType() + "|" + " Clarity: " + this.getClarityType()+ " | type - Semiprecious Stone \n");
    }
}
