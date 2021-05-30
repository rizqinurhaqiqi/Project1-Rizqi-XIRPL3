/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Rizky
 */
import java.util.ArrayList;

public class Transaksi {
    private final String noTransaksi;
    private final String namaPemesan;
    private final String tanggal;
    private String noMeja;
    private final ArrayList<Pesanan> pesanan;
    private double uangBayar;
    private double pajak;
    private double totalBayar;
    private double biayaService = 0;

    public Transaksi(String no_transaksi, String nm_pemesan, String tanggal, String no_meja){
        this.noTransaksi = no_transaksi;
        this.namaPemesan = nm_pemesan;
        this.tanggal = tanggal;
        this.noMeja = no_meja;

        pesanan = new ArrayList<>();
    }

    public void tambahPesanan(Pesanan pesanan){

         this.pesanan.add(pesanan);
    }

   // public Pesanan getPesanan(){
   //    return null;
   //}

    public ArrayList<Pesanan> getSemuaPesanan(){
        return pesanan;
    }

    public double hitungTotalBayar(){
        return 0;
    }

    public double hitungKembalian(){
        return 0;
    }
    
     public void setBiayaService(double service){
        this.biayaService = service;
    }

    public void setPajak(double pajak){
        this.pajak = pajak;
    }

    public double hitungTotalPesanan(){
        for(int i = 0; i < pesanan.size(); i++){
            Pesanan pesan = pesanan.get(i);
            double harga = pesan.getMenu().getHarga();
            totalBayar += (harga * pesan.getJumlah());

        }
        return totalBayar;
    }

    public double hitungPajak(){
        return totalBayar * pajak;
    }

    public double hitungBiayaService(){
        return totalBayar * biayaService;
    }

    public double hitungTotalBayar(double pajak, double service){
        totalBayar = totalBayar + pajak + service;
        return totalBayar;
    }

    public double hitungKembalian(double uang_bayar){
        return uang_bayar - totalBayar;
    }



    public void cetakStruk(){
         System.out.println("\n======== NEMARRAMEN ========");
        System.out.println("No. Transaksi: " + noTransaksi);
        System.out.println("Pemesan: " + namaPemesan);
        System.out.println("Tanggal: " + tanggal);
        
        
        if(noMeja.equals("")){
            noMeja = "Take Away";
        }

        System.out.println("Meja " + noMeja);
        System.out.println("==================");
        for (int i = 0; i < pesanan.size(); i++){
            Pesanan pesan = pesanan.get(i);
            Menu m = pesan.getMenu();
            String pesanan = pesan.getJumlah() + " " + m.getNama_menu() + "\t" +(m.getHarga()*pesan.getJumlah());

            if(m.getKategori().equals("Kuah")){
                pesanan = " " + pesanan;
            }

            System.out.println(pesanan);

        }
    } 
}
