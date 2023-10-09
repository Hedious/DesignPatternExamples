package objectDesigns;

public class PopKya extends Tea {
    private static final double dairyCreamerAmount = 1;
    private static final int akyaYayAmount = 60;

    private static final double sugarAmount = 1;

    public PopKya(SellingType sellingType) {
        super(sellingType, dairyCreamerAmount, akyaYayAmount, sugarAmount);
    }
}
