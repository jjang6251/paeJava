import java.util.Scanner;

public class QuadraticEq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이차방정식 ax^2 + bx + c 에 들어갈 계수를 입력하시오");
        System.out.print("a: ");
        float a = sc.nextFloat();

        System.out.print("b: ");
        float b = sc.nextFloat();

        System.out.print("c: ");
        float c = sc.nextFloat();

        float d = b*b - 4*a*c;

        if(d> 0){
            System.out.println("x = " + ((-b+Math.sqrt(d))/(2*a)));
            System.out.println("x = " + ((-b-Math.sqrt(d))/(2*a)));
        } else if(d==0) {
            System.out.println("x = " + -b/(2*a));
        } else {
            System.out.println("허근입니다!");
        }

    }
}
