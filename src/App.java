import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // Ativa mapeamento genérico de inputs
        System.out.println("Digite o número:");
        final int number = sc.nextInt(); // Registra o número
        
        System.out.println("Tabela de multiplicação de " + number);
        for (int i = 0; i < 11; i++) {
            final int mult = number * i;
            System.out.println(number + " x " + i + " = " + mult);
        }
    }
}
