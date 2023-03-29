package tugas;

//import lib
import java.io.InputStreamReader;
//import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class datamahasiswa {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nim, nama, prodi;
        int semester, sksdiambil;

        try {
            System.out.println("==== Data Mahasiswa ====");
//            input
            System.out.println("Nim : ");
            nim = br.readLine();
            System.out.println("Nama : ");
            nama = br.readLine();
            System.out.println("prodi : ");
            prodi = br.readLine();
            System.out.println("semester : ");
            semester = Integer.parseInt(br.readLine());
            System.out.println("jumlah sks yang diambil : ");
            sksdiambil = Integer.parseInt(br.readLine());

            System.out.println("NIM mahasiswa : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println("prodi : " + prodi);
            System.out.println("semester : " + semester);
            System.out.println("jumlah sks yang diambil : " + sksdiambil);




        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
    }
}
