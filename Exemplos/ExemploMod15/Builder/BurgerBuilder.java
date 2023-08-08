public abstract class BurgerBuilder {

    Burger burger = new Burger();

    abstract void buildBun();
    abstract void buildMeat();
    abstract void buildSalad();
    abstract void buildSauce();
    abstract void buildCheese();

    Burger build(){
        return burger;
    }
    public void createNewBurgerProduct() {
    }
    public void buildTopping() {
    }
    
}
