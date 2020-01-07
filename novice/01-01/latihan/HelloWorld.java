import java.*;
import java.util.Scanner;

class HelloWorld{
    public static void main(String[] args){
        // pembuatan variabel , tipe data, konstanta
        int a = 2,b = 2,total = 0,totalloop=0;
        String pesan = "Hallo Dunia";
        Double PI = 3.14;
        
        // pemnggunaan ekspresi
        total = a + b;

        // Penggunaan Looping dan operator +=
        for(int i=0; i < 3; i++){
            totalloop += b;
        }  

        int angka;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka yang anda inginkan");
        angka = scan.nextInt();

        if(angka > 5){
            System.out.println("Angka lebih besar dari 5 yaitu :" + angka);
        }
        else{
            System.out.println("Angka lebih kecil dari 5 yaitu :" + angka);
        }

        System.out.println("Bulan yang anda pilih : ");
        
        int bulan = 3;
        String namaBulan;
        switch(bulan){
            case 1:  namaBulan = "Januari";
                     break;
            case 2:  namaBulan = "Februari";
                     break;
            case 3:  namaBulan = "Maret";
                     break;
            case 4:  namaBulan = "April";
                     break;
            case 5:  namaBulan = "Mei";
                     break;
            case 6:  namaBulan = "Juni";
                     break;
            case 7:  namaBulan = "Juli";
                     break;
            case 8:  namaBulan = "Agustus";
                     break;
            case 9:  namaBulan = "September";
                     break;
            case 10: namaBulan = "Oktober";
                     break;
            case 11: namaBulan = "November";
                     break;
            case 12: namaBulan = "Desember";
                     break;
            default: namaBulan = "Bulan tidak ada";
                     break;
        }
        System.out.println(namaBulan);
        // output sebuah pesan
        System.out.println(pesan);
        System.out.println("Hello World");
        System.out.println("Hasil Ekspresi"+total);
        System.out.println("Hasil Looping"+total);
    }
}