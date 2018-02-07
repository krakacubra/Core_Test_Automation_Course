package ex4_OneDimentionalArray;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class OneDimentionalArray {
    private static int input(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input;
        try {
            input = Integer.parseInt(reader.readLine());
            return input;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 1;
    }
    private static double[] randomFillArray(int n, int max){
        Random random = new Random();
        double[] array = new double[n];
        for(int i = 0; i < n; i++){
            array[i] = Math.random()*max;
        }
        return array;
    }
    private static double[] fillArray(int n){
        double[] array = new double[n];
        for(int i = 0; i < n; i++){
            array[i] = input();
        }
        return array;
    }
    private static void arrayOutput(double[] array){
        try {
            for (double element : array) {
                System.out.printf("%.4f", element);
                System.out.print(" ");
            }
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
    }
    private static double max(double[] array){
        double max = -4.9e-324;
        for (int i = 0; i < array.length/2; i++){
            max = Math.max(max, array[i] + array[array.length - 1 - i]);
        }
        return max;
    }
    public static void main(String[] args){
        System.out.print("Enter number of elements in array: ");
        int n = input();
        if (n <= 0){
            System.out.print("n must be positive and bigger then 0");
            return;
        }
        System.out.print("Enter top boundary to array values: ");
        int max = input();
        double[] array = randomFillArray(n, max);
        arrayOutput(array);
        System.out.print("\nmax = " + max(array));




    }
}
