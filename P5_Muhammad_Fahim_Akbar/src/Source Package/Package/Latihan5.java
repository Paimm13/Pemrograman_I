import javax.swing.text.StyledEditorKit;
import java.util.Scanner;
import java.io.*;
public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihanPesanan;
        boolean daftarMenu = true;

        while (daftarMenu) {
            System.out.println("Selamat Datang di Cafe Taria\n");
            System.out.println("Silahkan Pilih Daftar Menu\n1. Makanan\n2. Minuman\n0. Keluar ");
            System.out.print("Masukan Pilihan : ");
            pilihanPesanan = input.nextInt();

            if (pilihanPesanan == 1) {
                System.out.println("\nDaftar Menu Makanan");
                System.out.println("1. Nasi Goreng\n2. Mie Goreng\n3. Kentang Goreng");
                System.out.println("Ketik '0' jika ingin melihat daftar minuman ");
                int kembaliMakanan;
                kembaliMakanan = input.nextInt();
                if(kembaliMakanan == 0) continue;

            }else if (pilihanPesanan == 2) {
                System.out.println("\nDaftar Menu Minuman");
                System.out.println("1. Americano\n2. Coffee Latte\n3. Sugar Latte");
                System.out.println("Ketik '0' jika ingin melihat daftar makanan");
                int kembaliMinuman;
                kembaliMinuman = input.nextInt();
                if(kembaliMinuman == 0) continue;
            } else if (pilihanPesanan == 0){
                System.out.println("Byee~");
                daftarMenu = false;
            } else {
                System.out.print("Pilihan tidak ada, coba lagi");
            }
        }
    }
}