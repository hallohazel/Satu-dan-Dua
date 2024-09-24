import java.util.Scanner;
public class Soaldua {
    public static void main(String[] args) {
        int siswa, jumlahSiswa, nilaiSiswa = 0, temp = 0;
        double totalNilai, rataRata; 
        Scanner in = new Scanner(System.in);
        
        System.out.println("PROGRAM PENGHITUNG NILAI");
        System.out.print("Masukkan Jumlah Siswa: ");
        jumlahSiswa = in.nextInt();
        siswa = 1;
        while (siswa <= jumlahSiswa) {
            System.out.print("Masukkan Nilai Siswa " + siswa + ": ");
            nilaiSiswa = in.nextInt();
            temp += nilaiSiswa;
            siswa++;
        }

        totalNilai = temp;
        rataRata = (double) temp / jumlahSiswa;
        
        System.out.println("\n=================================");
        System.out.println("            HASIL");
        System.out.println("=================================");
        System.out.println("Total Nilai   : " + totalNilai);
        System.out.println("Rata-Rata Nilai: " + rataRata);
        System.out.println("=================================");
        
        in.close();
    }
}
