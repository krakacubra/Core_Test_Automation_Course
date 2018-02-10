package ex2_Sequence;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sequence {
    private static int sequence(double eps){
        if(eps < 0){
            System.out.print("Epsilon must be positive!");
            return 0;
        }

        System.out.println("Elements of the sequence: ");

        int i = 1;
        double masElement;

        do{
            masElement = 1 / Math.pow(i++ + 1, 2);
            System.out.print(masElement + " ");
        } while (masElement >= eps);

        return i - 1;
    }
    private static float input(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float eps;
        try {
            eps = Float.parseFloat(reader.readLine());
            return eps;
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return 1;
    }
    public static void main(String[] args){
        System.out.print("Please enter epsilon : ");

        float eps = input();
        int index = sequence(eps);

        if (index > 0) {
            System.out.println();
            System.out.print("Index of the least element is " + index);
        }
    }
}
