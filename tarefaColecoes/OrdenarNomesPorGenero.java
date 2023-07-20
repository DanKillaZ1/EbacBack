import java.util.*;

public class OrdenarNomesPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes e gêneros separados por vírgula (ex: Ana-F, Felipe-M):");
        String input = scanner.nextLine();

        String[] dados = input.split(", ");

        List<String> nomesMulheres = new ArrayList<>();
        List<String> nomesHomens = new ArrayList<>();

        for (String dado : dados) {
            String[] pessoa = dado.split("-");
            String nome = pessoa[0];
            String genero = pessoa[1];

            if (genero.equalsIgnoreCase("F")) {
                nomesMulheres.add(nome);
            } else if (genero.equalsIgnoreCase("M")) {
                nomesHomens.add(nome);
            }
        }

        System.out.println("Nomes de mulheres:");
        for (String nome : nomesMulheres) {
            System.out.println(nome);
        }

        System.out.println("Nomes de homens:");
        for (String nome : nomesHomens) {
            System.out.println(nome);
        }
    }
}

