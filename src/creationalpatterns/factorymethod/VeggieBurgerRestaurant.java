package creationalpatterns.factorymethod;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger makeBurger() {
        return new VeggieBurger();
    }
}
