import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        int d = sc.nextInt();

        double rad = Math.toRadians(d);
        double x = a * Math.cos(rad) - b * Math.sin(rad);
        double y = a * Math.sin(rad) + b * Math.cos(rad);

        System.out.println(x + " " + y);
    }
}