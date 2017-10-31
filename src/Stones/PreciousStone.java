package Stones;

import Stones.StoneParameters.ClarityType;
import Stones.StoneParameters.GemCuttingType;
import Stones.StoneParameters.PreciousStoneList;

public class PreciousStone extends Stone {

    private PreciousStoneList name;


    public PreciousStone(PreciousStoneList name, double stoneWeight, double stonePricePerCarat,  GemCuttingType gemCuttingType, ClarityType clarityType) {
        super(stoneWeight, stonePricePerCarat, gemCuttingType, clarityType);
        this.name = name;
    }

    public PreciousStoneList getName() {
        return name;
    }

    @Override
    public String toString() {
        return ("\n Name: " + this.getName() + "| Weight: " + String.format("%.2f",this.getWeight()) + " Ct |" + " Price: " + "$ " +String.format("%.2f",this.getPrice()) +" | "+
                "  Gem Cut Type: " + this.getGemCuttingType() +" | "+ " Clarity: " + this.getClarityType() +" | type - Precious stone \n");
    }
}
