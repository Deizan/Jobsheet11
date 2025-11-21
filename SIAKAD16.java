import java.util.Scanner;

public class SIAKAD16 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int[][] nilai = new int[4][3];
        Scanner sc = new Scanner(System.in);

         for (int j = 0; j < nilai.length; j++) {
                System.out.println("Input nilai mahasiswa ke- " + (j + 1));
                double totalPersiswa = 0;
            for (int d = 0; d < nilai.length; d++) {
                System.out.print("Nilai mata kuliah " + (d+1) + ": ");
                nilai[d][j] = sc.nextInt();
                totalPersiswa += nilai[d][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke- " + (j+1) + totalPersiswa/nilai.length);
        }

            System.out.println("\n======================================");
            System.out.println("Rata-rataa Nilai setiap Mata Kuliah:");

          for (int j = 0; j < nilai[j].length; j++) {
            double totalPerMatkul = 0;
            for (int d = 0; d < nilai[d].length; d++) {
                totalPerMatkul += nilai[d][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul/nilai[j].length);
        }

        sc.close();
    }
}
