package PadroesProjeto1;

public class Toyota extends Fabrica{

    @Override
    public Car criarCarro(String nome) {
        if(nome.equals("Corolla")){
            return new Corolla();
        }else if(nome.equals("Etios")){
            return new Etios();
        }else{
            throw new IllegalArgumentException("Invalid car model");
        }
    }
    
}
