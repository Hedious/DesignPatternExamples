package creationalpatterns.abstractfactory;

public class ModernChair extends Chair {
    @Override
    public void createChair() {
        System.out.println("Modern Chair");
    }
}
