/**
 * Created by anshup on 24/08/15.
 */
public class Goods {
    String nameOfGood;
    float pricePerUnit;
    boolean isImported;
    int quantity;
    boolean isTaxable;
    float salesTax;
    public Goods(String nameOfGood, float pricePerUnit, int quantity, boolean isImported, boolean isTaxable) {
        this.nameOfGood = nameOfGood;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
        this.isImported = isImported;
        this.isTaxable = isTaxable;
    }

    public boolean isImported() {
        return isImported;
    }

    public void setIsImported(boolean isImported) {
        this.isImported = isImported;
    }

    public void calculateSalesTax(){
        float tax;
        if (this.isTaxable) {
            if (this.isImported) {
               tax= this.pricePerUnit * 15 / 100;
            }
            else {
                tax = this.pricePerUnit * 10 / 100;
            }

            //call method for rounding this off.
            this.salesTax = MyMath.roundOff(tax);
        }

    }
}
