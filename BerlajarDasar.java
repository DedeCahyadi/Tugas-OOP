
import java.util.Scanner;
public class BerlajarDasar {
    String matkul = "Pemrograman Berorientasi Obyek";
    String kelas = "D";

        public static void main(String[] args) {
            // Deklarasi variabel scanner
            Scanner input = new Scanner(System.in);
            String nama;
            int nim;

            // Ambil data dari keyboard
            System.out.println("============= MASUKAN BIODATA ANDA ============");
            System.out.print(" Masukkan Nama Anda = ");
            nama = input.nextLine();
            System.out.print(" Masukkan NIM Anda = ");
            nim = input.nextInt();

            //Output User
            System.out.println("\n------------- BIODATA ANDA --------------");
            System.out.println(" Nama Anda Adalah  = " + nama);
            System.out.println(" NIm Anda = " + nim);
            BerlajarDasar data = new BerlajarDasar();
            System.out.println(" Anda Sedang Mengikuti " + data.matkul + " Kelas " + data.kelas);

        }
}
