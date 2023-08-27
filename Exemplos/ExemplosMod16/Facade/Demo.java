package Facade;

public class Demo {

    public static void main(String[] args) {
        IApartamentoService service = new ApartamentoService();
        service.cadastrarApartamento(new Apartamento(1, "101", "A", "1", "Apartamento 101", "Disponível", "Apartamento", "1000", "200"));
    }
}
   
