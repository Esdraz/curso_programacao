package outros;

import java.util.Scanner;

public class valorPeca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoPeca1, codigoPeca2, numPeca1, numPeca2, qtdePecas;
        double valorUniPeca1, valorUniPeca2, valorAPagar;

        System.out.println("Entrada:");
        codigoPeca1 = sc.nextInt();
        numPeca1 = sc.nextInt();
        valorUniPeca1 = sc.nextDouble();
        codigoPeca2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        valorUniPeca2 = sc.nextDouble();

        valorAPagar = (valorUniPeca1 * numPeca1) + (valorUniPeca2 * numPeca2);

        System.out.printf("O VALOR A PAGAR: R$ %.2f",valorAPagar);
        sc.close();
    }
}
