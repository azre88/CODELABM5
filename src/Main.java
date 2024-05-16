import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        int i = 1;

        while (true) {

            System.out.println("Masukkan nama mahasiswa atau ketik 'selesai' untuk berhenti:");
            System.out.println("Masukkan nama mahasiswa ke-"+i+" :");
            String input = scanner.nextLine();



            if (input.isEmpty()) {
                try {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            namaMahasiswa.add( i + "." + input);
            i++;
        }

        System.out.println("Daftar mahasiswa yang diinputkan:");
        for (String nama : namaMahasiswa) {
            System.out.println("- " + nama);
        }

        scanner.close();
    }
}