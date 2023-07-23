package Exemplos.ExemplosMod13.abstratas;

public class programa {
    public static void main(String[] args) {
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Daniel");
        empregado.setSobrenome("Ribeiro");
        empregado.setSalario(1000d);
        imprimir(empregado);

        comissionado  comissionado= new comissionado ();
        comissionado.setCpf("2");
        comissionado.setNome("Daniel2");
        comissionado.setSobrenome("Ribeiro2");
        comissionado.setTotalVendas(2000d);
        comissionado.setTotalComissao(0.1d);
        imprimir(comissionado);

        horista horista = new horista ();
        horista.setCpf("22");
        horista.setNome("Daniel3");
        horista.setSobrenome("Ribeiro3");
        horista.setValorHora(29d);
        horista.setTotalHorasTrabalhadas(0.1d);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado) {
        if (empregado instanceof horista){
            horista hor = (horista) empregado;
            System.out.println(hor.getValorHora());
        }
        empregado.imprimirSobrenome();
        empregado.imprimirValores();
        System.out.println(empregado.getNome() + " tem salario de " + empregado.vencimento());
    }

    
    
}
