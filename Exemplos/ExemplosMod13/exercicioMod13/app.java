package Exemplos.ExemplosMod13.exercicioMod13;

public class app {

    /**
     * @param args
     */
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João", "Silva", "123.456.789-00", "Rua 1", "1234-5678", null, null, null );

        PessoaJuridica pj = new PessoaJuridica("Empresa", "S/A", "12.345.678/0001-00", "Rua 2", "1234-5678", null, null, null, null, null );

        System.out.println(pf.nome);

        System.out.println(pj.nomeFantasia);

    }

        
    
}
