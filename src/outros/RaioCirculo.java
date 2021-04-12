package outros;

import java.util.Scanner;

public class RaioCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio, areaCirculo;

        System.out.println("Entrada:");
        raio = sc.nextDouble();
        areaCirculo = raio * raio * 3.14159;

        System.out.printf("O valor da área do circulo é: %.4f", areaCirculo);
        sc.close();
    }
}
