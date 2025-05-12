import java.util.Scanner;

public class reverse {
    public static void reverseRecursive(int[] array, int start, int end) {
        if (start >= end) return;  

        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverseRecursive(array, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos elementos você deseja no array? ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }        
        reverseRecursive(array, 0, n - 1);
        System.out.println("Array invertido (recursivamente):");
        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
