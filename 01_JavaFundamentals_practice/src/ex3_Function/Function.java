package ex3_Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Function {
    private static double function(double x){
        return Math.tan(2 * x) - 3;
    }
    private static double input(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double input;
        try {
            input = Float.parseFloat(reader.readLine());
            return input;
        } catch (IOException e) {
            e.printStackTrace();

        }
        return 1;
    }
    private static void functionTable(double a, double b, double h){
        System.out.println("x         F(x)");
        double x;
        for( x = a; x <= b; x += h){
            System.out.printf("%.4f", x);
            System.out.print("   ");
            System.out.printf("%.4f", function(x));
            System.out.println();
        }
        if (x - h < b){                     // function value on the right bound, if (b - a) % h != 0
            System.out.printf("%.4f", b);
            System.out.print("   ");
            System.out.printf("%.4f", function(b));
            System.out.println();
        }
    }
    public static void main(String[] args){
        double a, b, h;
        System.out.print("Please enter left bound 'a' : ");
        a = input();
        System.out.print("Please enter right bound 'b' : ");
        b = input();
        System.out.print("Please enter step : ");
        h = input();
        if (a > b) {
            System.out.println("Wrong bounds, a must be bigger than b");
            return;
        }
        if (h > b - a || h < 0) {
            System.out.println("Wrong step");
            return;
        }
        functionTable(a, b, h);
    }
}
