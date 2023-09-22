package creationalpatterns.factorymethod;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger makeBurger() {
        return new BeefBurger();
    }
}
