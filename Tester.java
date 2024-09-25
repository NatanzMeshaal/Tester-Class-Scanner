package Toko;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("berapa jumlah object? 1 - 10");
        int jumlah = in.nextInt();
        //condition
        while(jumlah > 10 || jumlah < 1) {
            System.out.println("Terjadi kesalahan!");
            return;
        }
        for(int i=1; i<=jumlah; i++) {
            //mencegah error karena meng input selain int
            try {
                System.out.println("Silahkan pilih angka 1 untuk memuat CD atau pilih angka 2 untuk membuat DVD");
                int pilihan = in.nextInt();
                if (pilihan ==1) {
                    CD c = new CD();
                    c.print();
                } else if (pilihan ==2 ) {
                    DVD d = new DVD();
                    d.print();
                } else {
                    System.out.println("Pilih angka 1 atau 2!");
                }
            } catch (Exception e) {
                System.out.println("Pilih angka 1 atau 2 saja lee...");
            }
        }
        in.close();

        //mencegah error karena tidak sesuai

        // //Buat object dari class CD
        // CD cd = new CD();
        // DVD dvd = new DVD();

        // cd.print();
        // dvd.print();
    }
}
