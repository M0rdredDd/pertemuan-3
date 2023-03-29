import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class percabangan {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader
                (System.in));
        int usia=0;
        System.out.print("masukkan usia anda ; ");
        usia= Integer.parseInt(br.readLine());
        if (usia >= 17) {
            System.out.println("sudah memenuhi syarat");
        }else {
            System.out.println("belum memenuhi syarat");

        }
    }

}
