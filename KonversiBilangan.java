import java.util.Scanner;

public class KonversiBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("=============================");
            System.out.println(" Konversi Bilangan by Rashky ");
            System.out.println("=============================");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Hexa");
            System.out.println("4. Hexa ke Biner");
            System.out.println("5. Desimal ke Hexa");
            System.out.println("6. Hexa ke Desimal");
            System.out.println("0. Keluar");
            System.out.println("-----------------");
            System.out.print("Pilih operasi: ");

            int pilihan = input.nextInt();
            input.nextLine();

            System.out.println("-----------------");

            if (pilihan == 0) {
                System.out.println("Program telah selesai.");    
                System.out.println("======================");
                System.out.println("     Terimakasih!     ");
                System.out.println("======================");            
                break;
            }
            else if (pilihan == 1) {
                System.out.print("Masukkan bilangan biner: ");
                String biner = input.nextLine();

                int desimal = Integer.parseInt(biner, 2);
                System.out.println("Hasil konversi: " + desimal);
            }
            else if (pilihan == 2) {
                System.out.print("Masukkan bilangan desimal: ");
                int desimal = input.nextInt();

                input.nextLine();

                String biner = Integer.toBinaryString(desimal);
                System.out.println("Hasil konversi: " + biner);
            }
            else if (pilihan == 3) {
                System.out.print("Masukkan bilangan biner: ");
                String biner = input.nextLine();

                int desimal = Integer.parseInt(biner, 2);

                String hexa = Integer.toHexString(desimal);
                System.out.println("Hasil konversi: " + hexa);
            }
            else if (pilihan == 4) {
                System.out.print("Masukkan bilangan heksadesimal: ");
                String hexa = input.nextLine();

                int desimal = Integer.parseInt(hexa, 16);

                String biner = Integer.toBinaryString(desimal);
                System.out.println("Hasil konversi: " + biner);
            }
            else if (pilihan == 5) {
                System.out.print("Masukkan bilangan desimal: ");
                int desimal = input.nextInt();

                input.nextLine();

                String hexa = Integer.toHexString(desimal);
                System.out.println("Hasil konversi: " + hexa);
            }
            else if (pilihan == 6) {
                System.out.print("Masukkan bilangan heksadesimal: ");
                String hexa = input.nextLine();

                int desimal = Integer.parseInt(hexa, 16);
                System.out.println("Hasil konversi: " + desimal);
            }
            else {
                System.out.println("Pilihan tidak valid. Silakan pilih operasi yang benar.");
            }
        }

        input.close();
    }
}
