import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by anshup on 24/08/15.
 */
public class MainClass {
    public static void main(String args[])throws IOException{
        String eachLine="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Basket> baskets = new ArrayList<Basket>();
        System.out.println("What all things you bought today. Finish it by saying That is it");
        Basket basket = new Basket();
        while (!(eachLine=br.readLine()).equals("That is it")){
            if (eachLine.contains("Input")){
                baskets.add(basket);
                basket.clear();
                continue;
            }
            else {
               Goods good = processInputLine(eachLine);
                try {
                    basket.addGood(good);
                }catch(Exception e){
                    System.out.println("Some Exception"); // need to add specifics
                }
            }



        }

    }
    public static Goods processInputLine(String inputLine){
        String[] parts = inputLine.split("at");
        return new Goods();
    }
}
