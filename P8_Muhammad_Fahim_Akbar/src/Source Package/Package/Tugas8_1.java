import java.util.Scanner;

public class Tugas8_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ulangi;

        do {
            System.out.print("Masukan nama mahasiswa : ");
            String nama = input.nextLine();

            System.out.print("Masukan nilai : ");
            int nilai = input.nextInt();

            System.out.println("Nilai Mahasiswa "+nama+" yaitu "+nilai);

            System.out.print("Ulang input? (y/n) : ");
            ulangi = input.next().charAt(0);
            input.nextLine();
        } while(ulangi == 'y' || ulangi == 'Y');
    }
}
