import java.util.Scanner;
public class fibonacci {
    public static boolean verificaFibonacci(int numero) {
        int anterior = 0;
        int atual = 1;
        
        if (numero == 0 || numero == 1) {
            return true;
        }
        
        while (atual <= numero) {
            int proximo = anterior + atual;
            
            if (proximo == numero) {
                return true;
            }
            
            anterior = atual;
            atual = proximo;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        scanner.close();
        
        System.out.println(numero + (verificaFibonacci(numero) ? " pertence à sequência de Fibonacci." : " não pertence à sequência de Fibonacci."));
    }
}