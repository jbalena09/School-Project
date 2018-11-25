import java.text.DecimalFormat;
public class format {
    public static void main(String[] args){
        DecimalFormat a = new DecimalFormat("#.##");
        float x = (float)1.3423213 * 21;
        System.out.println(a.format(x));
    }
}
