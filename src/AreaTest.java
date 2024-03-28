import java.util.Scanner;

public class AreaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("반지름: ");
        double radius = sc.nextDouble();
        final double PI = 3.141592;

        double area = radius * radius * PI;

        System.out.println("원의 면적: " + area);
    }
}
