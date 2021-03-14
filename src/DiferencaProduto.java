import java.util.Scanner;

public class DiferencaProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.println("Entrada:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        diferenca = (a * b - c * d);
        System.out.println("Saida:");
        System.out.println("DIFERENÇA = " + diferenca);
    }
}
