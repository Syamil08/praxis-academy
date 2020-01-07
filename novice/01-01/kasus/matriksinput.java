import java.*;
import java.util.*;
import java.util.Scanner;

class matriksinput{
    public static void main(String[] args){
        int baris,kolom;

        // Scanner untuk input / masukannya
        Scanner input = new Scanner(System.in);
        baris = input.nextInt();
        kolom = input.nextInt();

        // Deklarasi variabel untuk matriks
        int[][] a = new int[baris][kolom];
        int[][] b = new int[baris][kolom];
        int[][] total = new int[baris][kolom];

        System.out.println("Matriks A");
        for(int i=0; i<baris; i++){
            for(int j=0; j<kolom; j++){
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriks B");
        for(int i=0; i<baris; i++){
            for(int j=0; j<kolom; j++){
                b[i][j] = input.nextInt();
            }
        }

        System.out.println("Total Penjumlahan");
        for(int i=0; i<baris; i++){
            for(int j=0; j<kolom; j++){
                total[i][j] = a[i][j] + b[i][j];
                System.out.print(total[i][j] + " ");
            }
            System.out.println("");
        }
    }
}