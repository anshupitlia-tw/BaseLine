import java.util.ArrayList;

/**
 * Created by anshup on 24/08/15.
 */
public class Basket {
    ArrayList<Goods> basket = new ArrayList<Goods>();

    public Basket(ArrayList<Goods> basket) {
        this.basket = basket;
    }
    public Basket(){

    }
    public void addGood(Goods g){
        this.basket.add(g);
    }

    public void clear(){
        this.basket.clear();
    }
    public void display(){
        float totalSalesTax =0.0f, totalAmount = 0.0f;
        for (Goods eachGood: basket){
            totalAmount += eachGood.pricePerUnit+eachGood.salesTax;
            totalSalesTax+=eachGood.salesTax;
            System.out.println(eachGood.quantity + " " + eachGood.nameOfGood + ":" + eachGood.pricePerUnit+eachGood.salesTax);
        }
        System.out.println("Sales Tax:"+ totalSalesTax);
        System.out.println("Total:"+ totalAmount);

    }
}
