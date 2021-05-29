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

    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         
          MainAplikasiKasir app = new MainAplikasiKasir();

        app.generateDaftarMenu();
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
