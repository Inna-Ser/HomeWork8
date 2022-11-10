public class Main  {
    public static void main(String[] args) {
        // цельночисленные
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
    }
}
