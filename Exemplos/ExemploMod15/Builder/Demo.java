import java.io.ObjectInputStream.GetField;

public class Demo{

    public static void main(String[]args){
        //Gerente gerente = new Gerente(new CheeseBurgerBuilder());
        Gerente gerente = new Gerente();
        gerente.setBuilder(new CheeseBurgerBuilder());
        Burger burger = gerente.buildBurger();
        burger.print();

        gerente.setBuilder(new VeganBurgerBuidler());
        Burger burger2 = gerente.buildBurger();
        burger2.print();
        
            
    }
}