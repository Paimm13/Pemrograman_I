import java.util.Scanner;
public class Tugas4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usdCurrency; int idrCurrency;
        System.out.print("Haloo! Fahim!\n\n");
        System.out.print("--------Konversi Uang dari USD to IDR--------");
        System.out.print("\n1 USD = Rp. 16.9000\n");
        System.out.print("Masukan Jumlah USD = $");
        usdCurrency = input.nextInt();
        idrCurrency = usdCurrency*16900;
        System.out.print("\n\n--------Hasil Konversi USD To IDR--------");
        System.out.print("\nJumlah USD = $"+usdCurrency+"\n");
        System.out.print("Jumlah IDR = Rp. "+idrCurrency);
    }
}