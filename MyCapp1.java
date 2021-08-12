package MyCaptain;
import java.util.Scanner;
public class MyCapp1 {
    static float YearConverter(float a){
        float c = a/525600f;
        return c;
    }
    static float HoursConverter(float a){
        float c = a/60f;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of minutes you want to convert into years and hours: ");
        float a = sc.nextFloat();
        float c;
        c=YearConverter(a);
        System.out.println(a +" minutes into years : "+c);

        c= HoursConverter(a);
        System.out.println(a +" minutes into hours : "+c);
    }
}
