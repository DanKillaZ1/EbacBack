package Exemplos.CadastroCliente;

import Exemplos.CadastroCliente.dao.ClienteMapDAO;
import Exemplos.CadastroCliente.dao.IClienteDAO;

import javax.swing.JOptionPane;
import javax.swing.*;


public class App {

    private static IClienteDAO IClienteDAO;

    public static void main(String[] args) {
        IClienteDAO = new ClienteMapDAO();

        

        String opcao = JOptionPane.showInputDialog( parentComponent: null, message: "Digite 1 para cadastros, 2 para consultar, 3 para exclusão, 4 para alteração e 5 para sair", title: "Green dinner", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoCadastro(opcao)){
            if("".equals(opcao)){
                sair();
            }
            opcao = JOptionPane.showInputDialog( parentComponent: null, message: "Opçao invalida, digite 1 para cadastros, 2 para consultar, 3 para exclusão, 4 para alteração e 5 para sair", title: "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if (isOpcaoCadastro(opcao)) {            
           JOptionPane.showMessageDialog( parentComponent: null, message: "Opcao: " + opcao, title: "Error", JOptionPane.INFORMATION_MESSAGE);


        }
    }

    private static void sair() {
        JOptionPane.showMessageDialog( parentComponent: null, message: "Saindo do sistema", title: "Green dinner", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    
}
