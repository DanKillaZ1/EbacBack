package Exemplos.ExemplosMod13.exercicioMod13;

class PessoaFisica extends Pessoa {

    public String dataNascimento;
    public String sexo;

    public PessoaFisica(String nome, String sobrenome, String cpf, String endereco, String telefone, String email, String dataNascimento, String sexo) {
        super(nome, sobrenome, cpf, endereco, telefone, email);
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }
    
}
