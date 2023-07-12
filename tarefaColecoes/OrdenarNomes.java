import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os nomes separados por vírgula:");
        String nomesInput = scanner.nextLine();
        
        String[] nomes = nomesInput.split(",");
        
        // Remover espaços em branco dos nomes
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }
        
        // Ordenar os nomes em ordem alfabética
        Arrays.sort(nomes);
        
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
