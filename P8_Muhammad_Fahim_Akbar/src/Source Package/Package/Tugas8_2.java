import java.util.Scanner;

public class Tugas8_2 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        String nama;
        int total = 0;
        char tambahNilai;

        System.out.print("Masukan Nama Mahasiswa : ");
        nama = input.nextLine();
        do {
            System.out.print("Masukan Nilai : ");
            int nilai = input.nextInt();
            total += nilai;

            System.out.print("Lanjut input nilai? (y/n) : ");
            tambahNilai = input.next().charAt(0);
            input.nextLine();
        } while(tambahNilai == 'y' || tambahNilai == 'Y');

        System.out.print("\nNama : " + nama + "\nTotal nilai : "+total);
    }
}
