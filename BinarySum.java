import java.util.Scanner;

public class BinarySum {
    public static String binarySum(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "1010";
        String b = "0011";
        System.out.println("Soma binária: " + binarySum(a, b));
    }
}
