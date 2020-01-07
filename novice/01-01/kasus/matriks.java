import java.util.Scanner;
import java.util.*;

class matriks{
    public static void main(String[] args){
        // System.out.println("Hello");
        int[][] a = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                };
        int[][] b = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                };
        int[][] total = new int [3][3];
        // for(int i=0; i<4; i++){
        //     for(int j=0; j<4; j++){
        //         Scanner input = new Scanner(System.in);
        //         a[i][j] = input.nextInt();
        //     }
        // }

        // for(int i=0; i<4; i++){
        //     for(int j=0; j<4; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println("");
        // }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                total[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(total[i][j] + " ");
            }
            System.out.println("");
        }
    }
}