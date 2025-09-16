package Week3;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();

        System.out.println("===========================");
        System.out.println("String anda : " + nama);
        System.out.println("1. charAt");
        System.out.println("2. length");
        System.out.println("3. substring(n)");
        System.out.println("4. substring(m,n)");
        System.out.println("5. contains");
        System.out.println("6. concat");
        System.out.println("7. replace");
        System.out.println("8. split");
        System.out.println("9. lowerCase");
        System.out.println("10. upperCase");
        System.out.print("Pilih menu : ");
        int menu = input.nextInt();
        input.nextLine(); // buffer

        switch(menu) {
            case 1:
                System.out.println("-----charAt-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input indeks : ");
                int idx = input.nextInt();
                System.out.println("Hasil : " + nama.charAt(idx));
                break;

            case 2:
                System.out.println("-----length-----");
                System.out.println("Nama : " + nama);
                System.out.println("Input : " + nama.length());
                break;

            case 3:
                System.out.println("-----substring(n)-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input : ");
                int start = input.nextInt();
                System.out.println("Hasil : " + nama.substring(start));
                break;

            case 4:
                System.out.println("-----substring(m,n)-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input mulai : ");
                int m = input.nextInt();
                System.out.print("Input akhir : ");
                int n = input.nextInt();
                System.out.println("Hasil : " + nama.substring(m, n));
                break;

            case 5:
                System.out.println("-----contains-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input : ");
                String kata = input.nextLine();
                System.out.println("Hasil : " + nama.contains(kata));
                break;

            case 6:
                System.out.println("-----concat-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input : ");
                String tambahan = input.nextLine();
                System.out.println("Hasil : " + nama.concat(" " + tambahan));
                break;

            case 7:
                System.out.println("-----replace-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input kata yang diganti : ");
                String target = input.nextLine();
                System.out.print("Input kata pengganti : ");
                String ganti = input.nextLine();
                System.out.println("Hasil : " + nama.replace(target, ganti));
                break;

            case 8:
                System.out.println("-----split-----");
                System.out.println("Nama : " + nama);
                System.out.print("Input : ");
                int splitIdx = input.nextInt();
                // Potong string sesuai input index
                String bagian1 = nama.substring(0, splitIdx-1);
                String bagian2 = nama.substring(splitIdx-1, splitIdx+1);
                String bagian3 = nama.substring(splitIdx+1);
                System.out.println("Hasil : " + bagian1);
                System.out.println("Hasil : " + bagian2);
                System.out.println("Hasil : " + bagian3);
                break;

            case 9:
                System.out.println("-----lowerCase-----");
                System.out.println("Nama : " + nama);
                System.out.println("Hasil : " + nama.toLowerCase());
                break;

            case 10:
                System.out.println("-----upperCase-----");
                System.out.println("Nama : " + nama);
                System.out.println("Hasil : " + nama.toUpperCase());
                break;

            default:
                System.out.println("Menu tidak valid!");
        }

        input.close();
    }
}