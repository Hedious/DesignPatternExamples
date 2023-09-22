package creationalpatterns.factorymethod;

public class BeefBurger extends Burger {
    @Override
    void prepare() {
        System.out.println("Preparing BeefBurger");
    }
}
