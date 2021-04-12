package outros;

import java.util.Scanner;

public class LerDoisValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1, v2, soma;

        System.out.println("Entrada:");
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        soma = v1 + v2;

        System.out.println("Saída:");
        System.out.println("SOMA: " + soma);
        sc.close();
    }
}
