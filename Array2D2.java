// This program takes a 3x3 matrix input from the user,
// prints the matrix, and searches for a given key element
// in the matrix and displays its position if found.


import java.util.Scanner;

public class Array2D2 {

    public static boolean Search(int matrix[][], int key){

        for (int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[0].length; j++){

                if(matrix[i][j] == key){
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }

            }
        }

        System.out.println("Key is not found");
        return false;
    }


    public static void main(String args[]){

        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Matrix");

        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix1[j] = sc.nextInt();
            }
        }

        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }

        Search(matrix,5);
    }
}