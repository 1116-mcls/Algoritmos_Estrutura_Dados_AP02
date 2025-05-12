import java.util.Scanner;

public class Regua {

    public static void drawRegua(int n) {
        drawInterval(n);
    }

    private static void drawInterval(int central) {
        if (central == 0) return;

        drawInterval(central - 1);              
        System.out.println("-".repeat(central));
        drawInterval(central - 1);              
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Digite a profundidade da régua: ");
        int profundidade = scanner.nextInt();  

        System.out.println("Régua de profundidade " + profundidade + ":");
        drawRegua(profundidade);
        
        scanner.close();
    }
}

