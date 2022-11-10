public class Main {
    public static void main(String[] args) {
        // цельночисленный массив
        int[] threeNumbers = new int[3];
        threeNumbers[0] = 1;
        threeNumbers[1] = 2;
        threeNumbers[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (threeNumbers[i] % 2 != 0) {
                System.out.print(threeNumbers[i] + 1);
            }
            else {
                System.out.print(", " + threeNumbers[i] + ", ");
            }
        }
        // дробный массив
        double[] threeFractions = {1.57, 7.654, 9.986};
        for (int x = threeFractions.length - 1; x > 0; x--);
        // символьный массив
        char[] world = new char[5];
        world[0] = 'H';
        world[1] = 'e';
        world[2] = 'l';
        world[3] = 'l';
        world[4] = 'o';
    }
}
