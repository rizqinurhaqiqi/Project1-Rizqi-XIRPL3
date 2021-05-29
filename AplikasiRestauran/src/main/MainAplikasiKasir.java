/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Rizky
 */
import classes.*;
import java.util.Scanner;

public class MainAplikasiKasir {
    public DaftarMenu daftarMenu;
    public static double PAJAK_PPN = 0.10;
    public static double BIAYA_SERVICE = 0.05;
    
    
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         String no_transaksi, nama_pemesan, tanggal, no_meja = "";
         String transaksi_lagi = "", pesan_lagi = "", keterangan = "", makan_ditempat;
         int jumlah_pesanan, no_menu;
        
          MainAplikasiKasir app = new MainAplikasiKasir();

        app.generateDaftarMenu();
        
        System.out.println("\t \t \t");
        System.out.println("========= TRANSAKSI =========");
        System.out.println("No. Transaksi: ");
        no_transaksi = input.nextLine();
        System.out.println("Pemesan: ");
        nama_pemesan = input.nextLine();
        System.out.println("Tanggal: [dd/mm/yyyy]");
        tanggal = input.nextLine();
        System.out.println("Makan ditempat? [Y/N] ");
        makan_ditempat = input.nextLine();

        if (makan_ditempat.equalsIgnoreCase("Y")){
            System.out.println("Nomor Meja: ");
            no_meja = input.next();
        }
    }

    public void generateDaftarMenu(){
         daftarMenu = new DaftarMenu();

        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));

        daftarMenu.tambahMenu(new Kuah("Kuah Original"));
        daftarMenu.tambahMenu(new Kuah("Kuah International"));
        daftarMenu.tambahMenu(new Kuah("Kuah Spicy"));
        daftarMenu.tambahMenu(new Kuah("Kuah Soto Padang"));

        daftarMenu.tambahMenu(new Toping("Crab Stick Bakar", 6000));
        daftarMenu.tambahMenu(new Toping("Chicken Katsu", 8000));
        daftarMenu.tambahMenu(new Toping("Gyoza Goreng", 4000));
        daftarMenu.tambahMenu(new Toping("Bakso Goreng", 7000));
        daftarMenu.tambahMenu(new Toping("Enoki Goreng", 5000));

        daftarMenu.tambahMenu(new Minuman("Jus Alpukat SPC", 10000));
        daftarMenu.tambahMenu(new Minuman("Jus Strawberry", 11000));
        daftarMenu.tambahMenu(new Minuman("Cappucino Cofee", 15000));
        daftarMenu.tambahMenu(new Minuman("Vietnam Drip", 14000));

        daftarMenu.tampilDaftarMenu();
    }
}
