package Exemplos.ExemplosMod13.abstratas;

public class horista extends Empregado{

    private Double valorHora;

    private Double totalHorasTrabalhadas;

    public Double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getTotalHorasTrabalhadas() {
        return this.totalHorasTrabalhadas;
    }

    public void setTotalHorasTrabalhadas(Double totalHorasTrabalhadas) {
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
    }

    @Override
    public Double vencimento() {
        return valorHora * totalHorasTrabalhadas;
    }

    
}
