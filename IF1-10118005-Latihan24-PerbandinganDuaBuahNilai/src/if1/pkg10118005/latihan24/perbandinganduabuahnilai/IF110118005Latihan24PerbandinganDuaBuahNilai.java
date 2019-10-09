/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan24.perbandinganduabuahnilai;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA			: Rycho Rantung
 * KELAS		: IF-1
 * NIM			: 10118005
 * Deskripsi Program	: Program yang berisi program yang membandingkan dua buah nilai
 */
public class IF110118005Latihan24PerbandinganDuaBuahNilai {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		System.out.println("========Program Perbandingan Nilai=============");
		Scanner sc = new Scanner(System.in);
		String Status = "Ya";	
		while (Status.equals("Ya")){
			System.out.print("Masukkan nilai pertama : ");
			int[] nilai = new int[2];
			nilai[0] = sc.nextInt();
			System.out.print("Masukkan nilai kedua : ");
			nilai[1] = sc.nextInt();
			System.out.println("Hasil : " + nilai[0] + ((nilai[0] < nilai[1]) ? " Lebih Kecil " : ((nilai[0] == nilai[1]) ? " Sama Dengan " : " Lebih Besar ")) + nilai[1] );
			System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
			Status = sc.next();
		}
	}
	
}
