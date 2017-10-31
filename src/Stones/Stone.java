package Stones;

import Stones.StoneParameters.ClarityType;
import Stones.StoneParameters.GemCuttingType;

public class Stone {

    private double weight;
    private double price;
    private GemCuttingType gemCuttingType;
    private ClarityType clarityType;


    public Stone(double stoneWeight, double stonePricePerCarat, GemCuttingType gemCuttingType, ClarityType clarityType) {
        this.weight = stoneWeight;
        this.price = stonePricePerCarat;
        this.gemCuttingType = gemCuttingType;
        this.clarityType = clarityType;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public GemCuttingType getGemCuttingType() {
        return gemCuttingType;
    }

    public ClarityType getClarityType() {
        return clarityType;
    }


    @Override
    public String toString() {
        return ("\n Stone: \n" + "weight: " + String.format("%8.3f", weight) + "\n price: " + String.format("%8.3f", price) +
        "\n Gem Cut Type: " + gemCuttingType + "\n Clarity: " + clarityType);
    }
}


