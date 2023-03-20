import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class test {
    public static void main(String[] args) {
        int n = 5;
        double result = 1;
        double sum=0;
        for (int i = 1; i <= n; i++) {
            result=1;
            for (int j = 1; j <= i; j++) {
                result *= j;
            }
            sum+=result;
        }
        System.out.println(sum);

        double value = 12312.4245132123;

        BigDecimal result2 = new BigDecimal(value);
        result2 = result2.setScale(3, RoundingMode.DOWN);


        System.out.println(result2);


    }


}
