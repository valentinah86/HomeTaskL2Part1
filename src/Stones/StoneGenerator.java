package Stones;

// создает рандомный драгоценный либо полудрагоценный камен

import Stones.StoneParameters.ClarityType;
import Stones.StoneParameters.GemCuttingType;
import Stones.StoneParameters.PreciousStoneList;
import Stones.StoneParameters.SemiPreciousStoneList;

import java.util.Random;

public class StoneGenerator {
    private Random random = new Random();
    private ClarityType gemClarityType;


    private ClarityType generateClarityType(){
        ClarityType clarityType = ClarityType.values()[random.nextInt(ClarityType.values().length)];
        gemClarityType = clarityType;
        return clarityType;
    }

    private ClarityType getGemClarityType() {
        return gemClarityType;
    }

    private double calculatePriceByClarity(ClarityType clarityType){

        double stonePricePerCarat;

        if (clarityType.toString().equals("FL")|| clarityType.toString().equals("IF"))
        {
            stonePricePerCarat = random.nextDouble()*1500+0.1;
        } else if (clarityType.toString().equals("VVS1")||clarityType.toString().equals("VVS2")||clarityType.toString().equals("VS1")){
            stonePricePerCarat = random.nextDouble()*1000+0.1;
        } else if (clarityType.toString().equals("VS2")||clarityType.toString().equals("Si1")||clarityType.toString().equals("Si2")){
            stonePricePerCarat = random.nextDouble()*750+0.1;
        } else {
            stonePricePerCarat = random.nextDouble()*100+0.1;
        }
        return stonePricePerCarat;
    }

    public Stone createStone (){

        switch (random.nextInt(2)){

            case 0:
                {
                    return new PreciousStone(
                            PreciousStoneList.values()[random.nextInt(PreciousStoneList.values().length)],
                            random.nextDouble()*10+0.1,
                            calculatePriceByClarity(generateClarityType()),
                            GemCuttingType.values()[random.nextInt(GemCuttingType.values().length)],
                             getGemClarityType());
                }

            case 1:
                {
                    return new SemipreciousStone(
                            SemiPreciousStoneList.values()[random.nextInt(SemiPreciousStoneList.values().length)],
                            random.nextDouble()*12+0.1,
                            0.5* calculatePriceByClarity(generateClarityType()),
                            GemCuttingType.values()[random.nextInt(GemCuttingType.values().length)],
                            getGemClarityType() );

                }

            default: throw new IllegalArgumentException();
        }
    }
}
