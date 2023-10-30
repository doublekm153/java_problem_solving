package chap_16;
import java.util.Calendar;
import java.util.Date;
public class JavaObjectType {
    public static void main(String[] args) {
        int [] m = {1,2,3};
        int[] n = new int[] {1,2,3};

        String card = "H8";
        Date d = new Date();
        Calendar cal = Calendar.getInstance();
        System.out.println(card);   //card.toString()
        System.out.println(d);   //d.toString()
        System.out.println(cal);   //cal.toString()
    }
}
