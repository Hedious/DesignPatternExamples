package objectDesigns;

public class ChoSaint extends Tea {
    private static final double dairyCreamerAmount = 3;
    private static final int akyaYayAmount = 40;

    private static final double sugarAmount = 3;
    public ChoSaint(SellingType sellingType) {
        super(sellingType, dairyCreamerAmount, akyaYayAmount, sugarAmount);
    }
}
