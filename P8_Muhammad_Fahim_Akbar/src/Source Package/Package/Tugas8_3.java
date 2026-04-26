import java.util.Scanner;

public class Tugas8_3 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        String nama;
        float total = 0;
        char tambahNilai;
        int count = 0;

        System.out.print("Masukan Nama Mahasiswa : ");
        nama = input.nextLine();
        do {
            System.out.print("Masukan Nilai : ");
            float nilai = input.nextFloat();
            total += nilai;
            count++;

            System.out.print("Lanjut input nilai? (y/n) : ");
            tambahNilai = input.next().charAt(0);
            input.nextLine();
        } while(tambahNilai == 'y' || tambahNilai == 'Y');

        float rataRata = total/count;
        System.out.print("\nNama : " +nama+ "\nTotal rata rata nilai : "+rataRata);
    }
}