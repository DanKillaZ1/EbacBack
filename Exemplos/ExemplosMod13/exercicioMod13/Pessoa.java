package Exemplos.ExemplosMod13.exercicioMod13;

abstract class Pessoa {

    public String nome;

    public String sobrenome;

    public String cpf;

    public String endereco;

    public String telefone;

    public String email;

    public Pessoa(String nome, String sobrenome, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
}
