package Exemplos.ExemplosMod13.abstratas;

public abstract class Empregado {
    
    private String nome;

    private String sobrenome;

    private String cpf;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    } 



    public abstract Double vencimento();

    public void imprimirSobrenome() {
        System.out.println("Meu sobrenome e " + this.sobrenome);
    }

    public void imprimirValores(){
        Double valor = vencimento();
        System.out.println("Meu valor e " + valor);
    }

    

}
