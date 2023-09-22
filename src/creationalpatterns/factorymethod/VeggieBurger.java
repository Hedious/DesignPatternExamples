package creationalpatterns.factorymethod;

public class VeggieBurger extends Burger {
    @Override
    void prepare() {
        System.out.println("Preparing VeggieBurger");
    }
}
