package ex5_XMatrix;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XMatrix {
    private static int input(){
        int input;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = Integer.parseInt(reader.readLine());
            return input;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }
    private static char[][]xMatrix(int n){
        char matrix[][] = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0, k = n - 1; j < n; j++, k--){
                if ((i == j || k == i) && j != n / 2 && i != n / 2){
                    matrix[i][j] = '1';
                    matrix[i][k] = '1';
                }
                else if (j == n / 2 && i != n / 2) {
                    matrix[i][j] = 'M';
                }
                else if (i == n / 2 && j != n / 2){
                    matrix[i][j] = 'L';
                }
                else if (i == n / 2 && j == n / 2){
                    matrix[i][j] = '0';
                }
                else {
                    matrix[i][j] = '0';
                    matrix[i][k] = '0';
                }

            }
        }
        return matrix;
    }
    private static void matrixOutput(char[][] matrix){
        for (char[] raw: matrix){
            for (char element: raw){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.print("Please enter dimention of the matrix : ");

        int n = input();
        if(n <= 0){
            System.out.print("Wrong number of dimentions!");
            return;
        }
        char matrix[][] = xMatrix(n);
        matrixOutput(matrix);
    }
}
