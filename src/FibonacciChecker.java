import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para verificar se está na sequência de Fibonacci:");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int numero) {
        int a = 0;
        int b = 1;

        while (a < numero) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return a == numero;
    }
}

