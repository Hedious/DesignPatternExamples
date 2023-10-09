package objectDesigns;

public class BlackCoffee extends Coffee {

    private int coffeePowderAmount;
    private int limemSlize;

    public BlackCoffee(SellingType sellingType) {
        super(sellingType);
        coffeePowderAmount = 4;
        limemSlize = 1;
        
    }
}
