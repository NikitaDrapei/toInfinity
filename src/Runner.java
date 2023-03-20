import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double un = 0;
        System.out.println("Введите n");
        do {
            n = sc.nextInt();
        } while (n <= 1);
        System.out.println(n);

        for (int i = 1; i <= n; i++) {//Стремитя к 0, точность до 6 знаков
            un = (1 / factorial(i)) * (factorialPlus(i));
            System.out.print("При n = " +i+ ", un not format = " + un+"             ");
            BigDecimal doubleUn = new BigDecimal(un);//Округление до 6 знаков
            doubleUn = doubleUn.setScale(6, RoundingMode.DOWN);

            System.out.printf("При n = %d, un = %f\n", i, doubleUn);

        }
        sc.close();

    }

    public static double factorial(int n) {
        double result = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }

            return result;
        }
    }

    public static double factorialPlus(int n) {
        double result = 1;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            result = 1;
            for (int j = 1; j <= i; j++) {
                result *= j;
            }
            sum += result;
        }
        return sum;
    }
}
