package Exemplos.ExemplosMod13.abstratas;

public class Assalariado extends Empregado{

    private double salario;

    public double getSalario() {
        return this.salario;
    }

    /**
     * @param salario
     */
    // public void setSalario(double salario) {
    //     this.salario = salario;
    // }

    

    @Override
    public Double vencimento() {
        return salario;
        
    }

    public void setSalario(double d) {
    }

    
    
}
