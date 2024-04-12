import java.math.BigInteger;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(factorial(input));
    }
    public static BigInteger factorial(int value){
        BigInteger result = BigInteger.valueOf(1);
        for (int x = 1; value >= x ;x++){
            result = result.multiply(BigInteger.valueOf(x));
        }
        return result;
    }
}
