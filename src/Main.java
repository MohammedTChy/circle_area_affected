
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextInt();
        double crust = scan.nextInt();
        System.out.println(solution(radius, crust));
        scan.close();
    }

    public static double solution(double radius, double crust) {
        return(radius - crust) * (radius - crust) / (radius * radius) * 100;
    }


}