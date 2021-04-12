package outros;

import java.util.Scanner;

public class lerTresValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C /2; // calculo triangulo retangulo: A= b.h/2
        circulo = Math.pow(C, 2) * 3.14159; // comprimento circunferencia: A= π.r² (π = 3,14 e r = raio)
        trapezio = ((A + B) /2) * C; // area do trapezio: A= B + b/2 .h
        quadrado = Math.pow(B, 2); // area do quadrado: A= L² ou A= b.h
        retangulo = A * B; // A= b.h

        System.out.println("Entrada:");
        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);
        sc.close();
    }
}
