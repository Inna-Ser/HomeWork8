public class Main {
    public static void main(String[] args) {
        // цельночисленные
        int[] threeNumbers = new int[3];
        threeNumbers[0] = 1;
        threeNumbers[1] = 2;
        threeNumbers[2] = 3;
        for (int i = threeNumbers.length - 1; i >= 1; i--) {
            System.out.print(threeNumbers[i] + ", ");
        } {
            System.out.print(threeNumbers[0]);
        }
        System.out.print("\n");
        // дробные
        double[] threeFractions = {1.57, 7.654, 9.986};
        for (int x = threeFractions.length - 1; x > 0; x--) {
            System.out.print(+threeFractions[x] + ", ");
        } {
            System.out.print(+threeFractions[0]);
        }
        System.out.print("\n");
        // символьные
        char[] world = new char[5];
        world[0] = 'H';
        world[1] = 'e';
        world[2] = 'l';
        world[3] = 'l';
        world[4] = 'o';
        for (int i = world.length - 1; i > 0; i--) {
            System.out.print(world[i] + ", ");
            } {
            System.out.print(world[0]);
        }
    }
}