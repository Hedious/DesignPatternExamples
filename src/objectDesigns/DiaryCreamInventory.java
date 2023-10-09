package objectDesigns;

public class DiaryCreamInventory extends Inventory {

    private static final int DAIRY_CREAM_PSC = 30;
    private static final String purchasingUnit = "Buu";
    private static final String inStockUnit = "Zoon";

    public DiaryCreamInventory(int purchasingQuantity) {

        super(
                purchasingQuantity,
                purchasingQuantity * DAIRY_CREAM_PSC,
                purchasingUnit,
                inStockUnit,
                DAIRY_CREAM_PSC);
    }
}
