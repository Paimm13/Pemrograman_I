import java.util.Scanner;
import java.io.*;

public class Latihan7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float kehadiran; float nilaiAkhir; float persentase;
        persentase = 21*75/100;

        System.out.print("Masukan jumlah kehadiran = ");
        kehadiran = input.nextFloat();
        System.out.print("Masukan nilah akhir = ");
        nilaiAkhir = input.nextFloat();

        if (kehadiran >= persentase){
            if(nilaiAkhir >= 80) {
                System.out.println("Nilai = "+nilaiAkhir+"\nGrade = A");
            } else if(nilaiAkhir >= 70){
                System.out.println("Nilai = "+nilaiAkhir+"\nGrade = B");
            } else if (nilaiAkhir == 60){
                System.out.println("Nilai = "+nilaiAkhir+"\nGrade = C");
            } else if (nilaiAkhir >= 55){
                System.out.println("Nilai = "+nilaiAkhir+"\nGrade = D");
            } else if (nilaiAkhir < 55){
                System.out.println("Nilai = "+nilaiAkhir+"\nGrade = E");
            }
        } else if(kehadiran < persentase){
            if(nilaiAkhir >= 55){
                System.out.println("Nilai = 55\nGrade = D");
            } else if (nilaiAkhir < 55){
                System.out.println("Nilai = "+nilaiAkhir+"\nGrade = E");
            }
        }

    }
}