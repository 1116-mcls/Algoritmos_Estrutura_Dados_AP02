import java.util.Scanner;

public class Fibs {

    public static int fibonacci(int k) {
        if (k == 0) return 0;
        if (k == 1) return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= k; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Digite o valor de k para calcular o Fibonacci: ");
        int k = scanner.nextInt();  

        int resultado = fibonacci(k);
        System.out.println("Fibonacci de " + k + " é: " + resultado);
        
        scanner.close();  
    }
}
