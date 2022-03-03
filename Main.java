import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String valor1 = receberInput("Digite um número: ");
        String valor2 = receberInput("Digite um número: ");
        String valor3 = receberInput("Digite um número: ");

        double resultado = adicionarValores(valor1, valor2);
        System.out.println("O resultado dos dois valores é: " + resultado);

        double resultado2 = adicionarValores(valor1, valor2, valor3);
        System.out.println("O resultado dos três valores é: " + resultado2);
    }
        static String receberInput(String frase) {
            System.out.print(frase);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }

        static double adicionarValores(String valor1, String valor2) {
            double numero1 = Double.parseDouble(valor1);
            double numero2 = Double.parseDouble(valor2);
            double resultado = numero1 + numero2;
            return resultado;
        }

        static double adicionarValores(String valor1, String valor2, String valor3) {
            double numero1 = Double.parseDouble(valor1);
            double numero2 = Double.parseDouble(valor2);
            double numero3 = Double.parseDouble(valor3);
            double resultado = numero1 + numero2 + numero3;
            return resultado;
        }
}
