import java.util.Scanner;

public class Tugas7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float kehadiran, realisasi;
        float nilaiTugas, nilaiUTS, nilaiUAS;
        float persenKehadiran;
        float nilaiKehadiran;
        float nilaiTotal;

        System.out.print("Masukan jumlah kehadiran = ");
        kehadiran = input.nextFloat();

        System.out.print("Masukan jumlah realisasi kehadiran = ");
        realisasi = input.nextFloat();

        System.out.print("Masukan nilai tugas = ");
        nilaiTugas = input.nextFloat();

        System.out.print("Masukan nilai UTS = ");
        nilaiUTS = input.nextFloat();

        System.out.print("Masukan nilai UAS = ");
        nilaiUAS = input.nextFloat();

        persenKehadiran = (kehadiran / realisasi) * 100;

        if (persenKehadiran >= 75) {
            nilaiKehadiran = persenKehadiran * 10 / 100;

            nilaiTotal = nilaiKehadiran +
                    (nilaiTugas * 20 / 100) +
                    (nilaiUTS * 30 / 100) +
                    (nilaiUAS * 40 / 100);

            System.out.println("\nPersentase Kehadiran = " + persenKehadiran + "%");
            System.out.println("Nilai Akhir = " + nilaiTotal);
            System.out.println("Status = Lulus");
        } else {
            nilaiKehadiran = persenKehadiran * 10 / 100;
            nilaiTotal = nilaiKehadiran +
                    (nilaiTugas * 20 / 100) +
                    (nilaiUTS * 30 / 100) +
                    (nilaiUAS * 40 / 100);
            System.out.println("\nPersentase Kehadiran = " + persenKehadiran + "%");
            System.out.println("Nilai Akhir = " + nilaiTotal);
            System.out.println("Status = Tidak Lulus");
        }
    }
}
