

public abstract class Trabalhador{

    public void executarRotina(){
        iniciarRotina();
        levantar();
        irAotrabalho();
        trabalhar();
        voltarParaCasa();
        passarRaiva();
       

    }
    protected abstract void trabalhar();

    private void voltarParaCasa(){
        System.out.println("Voltando para casa");

    }

    private void irAotrabalho(){
        System.out.println("Indo ao trabalho");
    }

    public void iniciarRotina(){
        System.out.println("Iniciando rotina");
    }   

    public void levantar(){
        System.out.println("Levantando");
    }

    public void passarRaiva(){
        System.out.println("Passando raiva");
    }
}