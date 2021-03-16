import java.util.Scanner;

public class numNegOuPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("Não Negativo");
        } else {
            System.out.println("Negativo");
        }
    }
}