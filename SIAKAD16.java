import java.util.Scanner;

public class SIAKAD16 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai untuk mahasiswa ke-" + (i + 1));

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.printf("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();

            }
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Input nilai mahasiswa ke- " + (i + 1));
                double totalPersiswa = 0;

            }
        }
    }
}
                