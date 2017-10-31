package Application;

import Necklace.Necklace;
import Necklace.NecklaceActions;
import Stones.StoneParameters.GemCuttingType;
import java.util.Arrays;
import java.util.Scanner;

public class Application {

    private static boolean isNumericValue(String X) throws NumberFormatException {
        try {
            Integer.parseInt(X);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public static void main(String[] args) {


	    Necklace necklace = new Necklace();
        NecklaceActions necklaceActions = new NecklaceActions();
	    Scanner str = new Scanner(System.in);
        String menuSelector = "";

	    System.out.println("\n -----------------------------------------------------"+
                           "\n|                        MENU                         |" +
                           "\n -----------------------------------------------------\n" +
                           "\n 1. Press 1 to create Necklace"+
                           "\n 2. Press 2 to Sort Stones by Price" +
                           "\n 3. Press 3 to Sort stones by Gem Cutting "+
                           "\n 4. Press 4 to filter stones by Gem Cut " +
                           "\n 5. Press 5 to filter stones by Price"+
                           "\n 6. Press Q to exit");


        while (!menuSelector.equals("Q")||!menuSelector.equals("q")){

            menuSelector = str.next();
            if (isNumericValue(menuSelector) && Integer.parseInt(menuSelector)>0 && Integer.parseInt(menuSelector)<6) {
                switch (Integer.parseInt(menuSelector)){
                    case 1: {
                        System.out.println("Insert number of stones in the Necklace");
                        String stoneNumbers = str.next();
                        if (isNumericValue(stoneNumbers) && Integer.parseInt(stoneNumbers)>0){
                            System.out.println(necklaceActions.createNecklace(necklace, Integer.parseInt(stoneNumbers)));
                            System.out.println("\n Necklace Weight = " + necklaceActions.calculateStoneWeight(necklace.getList()));
                            System.out.println("\n Necklace Price = " + necklaceActions.calculateStonesPrice(necklace.getList()));
                            continue;
                        }
                    }
                    case 2: {
                        System.out.println("\n Sorted by Price \n");
                        System.out.println(necklaceActions.sortStonesByPrice(necklace.getList()));
                        continue;
                    }
                    case 3: {
                        System.out.println("\n Sorted by Gem Cutting\n");
                        System.out.println(necklaceActions.sortStonesByGemCutting(necklace.getList()));
                        continue;
                    }
                    case 4:{
                        System.out.println("Filter Stones by Gem Cut" + "\n Possible Gem Cunt are \n" + Arrays.toString(GemCuttingType.values()));
                        System.out.println("Insert Gem Cut type");
                        String value = str.next();
                        System.out.println(necklaceActions.findStoneByGemCut(value,necklace.getList()));
                        continue;
                    }
                    case 5:{
                        System.out.println("Sorting Necklace by Price diapason.");
                        System.out.println("Insert minimum price\n");
                        double value1 = str.nextDouble();
                        System.out.println("Insert maximum price\n");
                        double value2 = str.nextDouble();
                        System.out.println(necklaceActions.findStoneByPriceDiapazone(value1,value2,necklace.getList()));

                    }
                }
            } else if (menuSelector.equals("Q")||menuSelector.equals("q")){
                break;
            } else {
                System.out.println("Incorrect parameter! Please, try again!");
            }
        }

    }

}

