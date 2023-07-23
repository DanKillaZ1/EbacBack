package Exemplos.ExemplosMod13.exercicioMod13;

class PessoaJuridica extends Pessoa{

    public String cnpj;
    public String inscricaoEstadual;
    public String razaoSocial;
    public String nomeFantasia;

    public PessoaJuridica(String nome, String sobrenome, String cpf, String endereco, String telefone, String email, String cnpj, String inscricaoEstadual, String razaoSocial, String nomeFantasia) {
        super(nome, sobrenome, cpf, endereco, telefone, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }
    
}
