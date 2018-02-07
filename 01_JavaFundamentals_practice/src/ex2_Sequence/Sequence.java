package ex2_Sequence;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sequence {
    private static int sequence(float eps){
        if(eps < 0){
            System.out.print("Epsilon must be positive!");
            return 0;
        }

        System.out.println("Elements of the sequence: ");

        int i = 1;
        float denominator;

        do{
            denominator = (i + 1) * (i + 1);
            System.out.print(1 / denominator + " ");
            i++;
        } while (1 / denominator >= eps);

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
