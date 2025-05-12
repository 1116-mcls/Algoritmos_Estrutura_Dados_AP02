import java.util.Scanner;

public class BinaryFib {
    public static void binaryFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(Integer.toBinaryString(a));
            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sequência de Fibonacci em binário:");
        binaryFibonacci(n);
    }
}
