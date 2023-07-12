import java.util.*;

public class OrdenarNomesPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes e gêneros separados por traço (-):");
        String input = scanner.nextLine();

        String[] dados = input.split("-");

        List<String> nomes = new ArrayList<>(Arrays.asList(dados));

        Collections.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

