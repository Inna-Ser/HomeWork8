public class Main {
    public static void main(String[] args) {
        // цельночисленные
        int[] threeNumbers = new int[3];
        threeNumbers[0] = 1;
        threeNumbers[1] = 2;
        threeNumbers[2] = 3;
        int lastSymbolT = threeNumbers[threeNumbers.length - 1];
        for (int i = 0; i < threeNumbers.length - 1; i++) {
            System.out.print(threeNumbers[i] + ", ");
        } {
            System.out.print(lastSymbolT);
        }
        System.out.println(" ");
        // дробные
        double[] threeFractions = {1.57, 7.654, 9.986};
        double lastSymbol = threeFractions[threeFractions.length - 1];
            for (int i = 0; i < threeFractions.length - 1; i++) {
                System.out.print(threeFractions[i] + ", ");
            } {
            System.out.print(lastSymbol);
        }
        System.out.println(" ");
        // символьные
        char[] world = new char[5];
        world[0] = 'H';
        world[1] = 'e';
        world[2] = 'l';
        world[3] = 'l';
        world[4] = 'o';
        char lastSymbolW = world[world.length - 1];
        for (int i = 0; i < world.length - 1; i++) {
            System.out.print(world[i] + ", ");
        } {
            System.out.print(lastSymbolW);
        }
    }
}