import java.lang.Math;
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculate() {
        if (this.a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (b == 0 && c != 0) {
                System.out.println("Phương trình có vô số nghiệm");
            }
        } else {
            double delta = (this.b * this.b) - (4 * this.a * this.c);
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có 1 nghiệm duy nhất x1 = x2 = " + (-(this.b) / (2 * this.a)));
            } else {
                double x1 = (-this.b - Math.sqrt(delta)) / (2 * this.a),
                        x2 = (-this.b + Math.sqrt(delta)) / (2 * this.a);

                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
class Ex14_1 {
    public static void main(String[] args) {
        QuadraticEquation qe1 = new QuadraticEquation();
        qe1.calculate();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();
        QuadraticEquation qe2 = new QuadraticEquation(a, b, c);
        qe2.calculate();
    }
}
