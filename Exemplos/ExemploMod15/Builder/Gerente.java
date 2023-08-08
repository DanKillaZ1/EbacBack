public class Gerente {

    BurgerBuilder builder;

    

    // public Gerente(BurgerBuilder builder){
    //     this.builder = builder;
    // }
    
    
    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }

    public Burger buildBurger(){
        builder.createNewBurgerProduct();
        builder.buildBun();
        builder.buildMeat();
        builder.buildSauce();
        builder.buildTopping();
        return builder.build();
    }
    
}

