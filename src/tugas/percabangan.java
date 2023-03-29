package tugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader
                (System.in));
        int usia=0;
//        System.out.print("masukkan usia anda ; ");
//        usia= Integer.parseInt(br.readLine());
//        if (usia >= 17) {
//            System.out.println("sudah memenuhi syarat");
//        }else {
//            System.out.println("belum memenuhi syarat");
//            +
//            String nim;
//            int nilaiuas;
//            System.out.println("masukkan nim anda : ");
//            nim = br.readLine();
//            System.out.println("masukkan nilai uas anda : ");
//            nilaiuas = Integer.parseInt(br.readLine());
//            if (nim.equalsIgnoreCase("22410100034")
//                    && nilaiuas == 80){
//                System.out.println("lulus");
//            } else if (nim.equalsIgnoreCase("22410100034")
//                    && nilaiuas == 70){
//                System.out.println("LULUS");
//            } else if (nim.equalsIgnoreCase("22410100034")
//                    && nilaiuas == 65) {
//            }else if (nim.equalsIgnoreCase("22410100034")
//                    && nilaiuas <65) {
//                System.out.println("tidak lulus");
//            }else {
//                System.out.println("nilai tidak ditemukkan");
//            }
        String menu, jenis;
        System.out.println("masukkan menu(makanan/minuman) : ");
        menu = br.readLine();
        System.out.println("masukkan jenis menu \n makanan: snack, nasi bubgkus, \n" + "minuman: kopi, teh, air mineral, pilih : ");
        jenis = br.readLine();

        if (menu.equalsIgnoreCase("snack")) {
            System.out.println("harga 2000");

        } else if (menu.equalsIgnoreCase("nasi bungkus")) {
            System.out.println("harga 7000");

            System.out.println("barang tidak ditemukan");

        } else if (menu.equalsIgnoreCase("minuman")) {
            System.out.println("Menu minuman : \n- Kopi\n- Teh\n- Air Mineral\n Silahkan pilih :");
            jenis = br.readLine();
            if (jenis.equalsIgnoreCase("kopi")) {
                System.out.println("Harga 3000");
            } else if (jenis.equalsIgnoreCase("teh")) {
                System.out.println("Harga 2000");
            } else if (jenis.equalsIgnoreCase("air mineral")) {
                System.out.println("Harga 6000");
            } else
            {System.out.println("Barang tidak ditemukan");
        }
        }
    }
}