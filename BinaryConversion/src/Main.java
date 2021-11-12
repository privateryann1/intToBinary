import java.util.Arrays;

public class Main {

    public static int intToBinary(int x) {
        int quotient = x / 2;
        int a = 1;
        while(quotient > 0) {
            a++;
            quotient = quotient / 2;
        }

        int[] remainders = new int[a];
        remainders[0] = x % 2;
        quotient = x / 2;

        for (int i = 1; i < a; i++) {
            remainders[i] = quotient % 2;
            quotient = quotient / 2;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < remainders.length; i++) {
            result.append(remainders[remainders.length - (i + 1)]);
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = scanner.nextInt();
        System.out.println(intToBinary(num));
    }

}
