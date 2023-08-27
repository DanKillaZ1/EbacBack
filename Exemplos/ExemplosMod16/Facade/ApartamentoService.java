package Facade;

public class ApartamentoService implements IApartamentoService{

    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isApartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isValidarCampos(apartamento);
        if(isCadastrado && isCamposValidos){
            return false;
        }
        return null;
    }

    private Boolean isApartamentoCadastrado(){
        return false;
    }
    
    private Boolean validarCampos(Apartamento apartamento){
        return false;
    }
}
