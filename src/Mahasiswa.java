import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;

    int nim;

    public Mahasiswa(String namaMhs, String klsMhs, String matkulMhs, int nimMhs) {
        nama = namaMhs;
        kelas = klsMhs;
        matkulPraktikum = matkulMhs;
        nim = nimMhs;
    }

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            HashMap<String, Mahasiswa> mhs = new HashMap<String, Mahasiswa>();

            String input;
            Mahasiswa data;

            mhs.put("1", new Mahasiswa("Lusy", "3K", "Struktur Data", 230));
            mhs.put("2", new Mahasiswa("Jeno", "3L", "Pemrograman Lanjut", 700));
            mhs.put("3", new Mahasiswa("Haechan", "3M", "Pemrograman Berorientasi Object", 600));

            System.out.print("Masukkan ID: ");
            input = scn.nextLine();
            data = mhs.get(input);
            if (data != null) {
                System.out.println("Data mahasiswa " + data.nama
                        + ", kelas : " + data.kelas + ", mata kuliah praktikum : "
                        + data.matkulPraktikum + ", nim : " + data.nim);
            } else {
                System.out.println("Data tidak ditemukan");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
