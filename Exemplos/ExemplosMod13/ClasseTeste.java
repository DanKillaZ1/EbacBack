package Exemplos.ExemplosMod13;




public class ClasseTeste {

    public static void main (String args[]){
        ICaneta caneta = new CanetEsferografica();
        caneta.escrever("Teste");
        caneta.escreverComumATodas();
        System.out.println("Cor da caneta: " + caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Ola daniel");
        System.out.println("Cor do giz: " + giz.getCor());


        Lapis lapis = new Lapis();
        lapis.escrever("Ola daniel");
        System.out.println("Cor do lapis: " + lapis.getCor());


        ICarro carro = new CarroPasseio();
        carro.andar();  
        carro.parar();




    }
    
}
