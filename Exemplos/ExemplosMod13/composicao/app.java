package Exemplos.ExemplosMod13.composicao;

public class app {

    public static void main(String[] args) {
        Banco banco = new Banco();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        banco.add(cc);
        banco.add(cp);
    }
    
}
