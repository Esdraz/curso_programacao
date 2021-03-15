import java.util.Scanner;

public class calculaSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numFuncionario, numHorasTrab;
        double valorPorHoraTrab, salFuncionario;

        System.out.println("Entrada:");
        numFuncionario = sc.nextInt();
        numHorasTrab = sc.nextInt();
        valorPorHoraTrab  = sc.nextDouble();

        salFuncionario = numHorasTrab * valorPorHoraTrab;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f", salFuncionario);
    }
}
