package Week2;

import java.util.Scanner;

public class Week2Tugas3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.print("Masukkan nilai terkecil: ");
	    int kecil = sc.nextInt();

	    System.out.print("Masukkan nilai terbesar: ");
	    int besar = sc.nextInt();

	    int total = 0;
	    for (int i = kecil; i <= besar; i++) {
	    	if (isPrima(i)) {
	    		total += i;
	        }
	    }

	     System.out.println("Jumlah dari semua bilangan prima dari " + kecil + " sampai " + besar + " adalah " + total);
	 }

	 static boolean isPrima(int n) {
		 if (n <= 1) return false;
	     for (int i = 2; i <= n / 2; i++) {
	    	 if (n % i == 0) return false;
	     }
	        return true;
	   }
	}

	
