package colecoesParte2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparadorGrupos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome da pessoa (ou 'sair' para encerrar):");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o sexo da pessoa ('M' para masculino, 'F' para feminino):");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Digite 'M' para masculino ou 'F' para feminino.");
            }
        }

        System.out.println("Grupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("Grupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
