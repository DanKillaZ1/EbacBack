package Facade;

public class Apartamento {

    private Long id;

    private String numero;

    private String bloco;

    private String andar;

    private String descricao;

    private String status;

    private String tipo;

    private String valor;

    private String condominio;


    public Apartamento(int i, String string, String string2, String string3, String string4, String string5,
            String string6, String string7, String string8) {
                this.id = (long) i;
                this.numero = string;
                this.bloco = string2;
                this.andar = string3;
                this.descricao = string4;
                this.status = string5;
                this.tipo = string6;
                this.valor = string7;
                this.condominio = string8;

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBloco() {
        return this.bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getAndar() {
        return this.andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCondominio() {
        return this.condominio;
    }

    public void setCondominio(String condominio) {
        this.condominio = condominio;
    }

    
}
