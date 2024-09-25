package Toko;

import java.util.Scanner;

public class TesterInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("CD/DVD");
        String pilihan = in.nextLine();

        System.out.println("Nama : ");
        String name = in.nextLine();
        System.out.println("Number :");
        int number = in.nextInt();
        System.out.println("Quantity : ");
        int Quantity = in.nextInt();
        System.out.println("Price : ");
        double price = in.nextDouble();
        in.nextLine(); //reset Scanner

        if(pilihan.equalsIgnoreCase("CD")) {
            System.out.println("Artist : ");
            String artist = in.nextLine();
            System.out.println("Label : ");
            String label = in.nextLine();
            System.out.println("Total Song :");
            int numSong = in.nextInt();
            CD c1= new CD(number, name, Quantity, Quantity, artist, numSong, label);
            c1.print();

        } else if(pilihan.equalsIgnoreCase("DVD")) {
            System.out.println("Length : ");
            int length = in.nextInt();
            System.out.println("Rating : ");
            String rating = in.nextLine();
            System.out.println("Studio : ");
            String studio = in.nextLine();
            DVD d1 = new DVD(number, name, Quantity, Quantity, length, rating, studio);
            d1.print();

        }
        in.close();
    }
}
