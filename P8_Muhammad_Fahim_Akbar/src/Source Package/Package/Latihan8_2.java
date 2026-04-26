import java.util.Scanner;

public class Latihan8_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Nama : ");
            String nama = input.nextLine();

            System.out.print("Nim : ");
            String nim = input.nextLine();

            System.out.println("Data : "+ nama + " - " + nim);

            System.out.print("Ulangi? (y/n) : ");
            ulang = input.next().charAt(0);
            input.nextLine(); //agar tidak error
        } while (ulang == 'y' || ulang == 'Y');
    }
}
