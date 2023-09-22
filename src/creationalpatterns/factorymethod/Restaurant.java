package creationalpatterns.factorymethod;

public abstract class Restaurant {

    public Burger orderBurger() {
        Burger burger = makeBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger makeBurger();
}
