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
}
