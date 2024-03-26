import java.util.Scanner;

public class inverterstring {
    public static String inverterString(String texto) {
        int tamanho = texto.length();
        StringBuilder textoInvertido = new StringBuilder();

        
        for (int i = tamanho - 1; i >= 0; i--) {
            textoInvertido.append(texto.charAt(i));
        }

        return textoInvertido.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase para inverter: ");
        String frase = scanner.nextLine();
        
        String fraseInvertida = inverterString(frase);
        System.out.println("A string invertida é: " + fraseInvertida);
        
        scanner.close();
    }
}
