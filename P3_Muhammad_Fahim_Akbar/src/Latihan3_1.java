import java.util.Scanner;

public class Latihan3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int umur;
        double tinggi;
        char JenisKelamin;
        boolean statusMahasiswa;

        System.out.print("Masukan nama anda : ");
        nama = input.nextLine();

        System.out.print("Masukan umur anda : ");
        umur = input.nextInt();

        System.out.print("Masukan tinggi anda : ");
        tinggi = input.nextDouble();

        System.out.print("Jenis kelamin (L/P) : ");
        JenisKelamin = input.next().charAt(0);

        System.out.print("Status Mahasisa (True/False) : ");
        statusMahasiswa = input.nextBoolean();

        System.out.println("\n---- Data Diri Mahasiswa ----");
        System.out.println("Nama : " + nama +
                "\nUmur : "+ umur +
                "\nTinggi : "+ tinggi +
                "\nJenis Kelamin : " + JenisKelamin +
                "\nStatus Mahasiswa : " + statusMahasiswa);
    }
}
