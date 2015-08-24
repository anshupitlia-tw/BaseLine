/**
 * Created by anshup on 24/08/15.
 */
public class MyMath {
    public static float roundOff(float tax){
        float roundOff = Math.round(tax * 100.0f) / 100.0f;
        return roundOff;
    }
}
