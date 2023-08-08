package PadroesProjeto1;

public class Honda extends Fabrica{

    @Override
    public Car criarCarro(String nome) {
        if(nome.equals("Civic")){
            return new Civic();
        }else if(nome.equals("Fit")){
            return new Fit();
        }else{
            throw new IllegalArgumentException("Invalid car model");
        }
    }

    @Override
    public Car createCarro(String nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCarro'");
    }
    
}
