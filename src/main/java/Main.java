import java.util.Arrays;
import java.util.LinkedList;

public static void main(String[] args) {
    // Buatlah sebuah deklarasi variabel dengan tipe data integer yang bernama ‘StrukturBaris’
    int StrukturBaris;

    // Buatlah sebuah deklarasi variabel dengan tipe data string yang bernama ‘KataBaru’ yang berisi kata ‘Deklarasi tipe data String’
    String KataBaru = "Deklarasi tipe data String";
    System.out.println(KataBaru);

    // Buatlah pendeklarasian array satu dimensi dengan nama ‘empatAngka’, tipe data integer, yang berisi angka (07, 10, 20, 23) Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.
    int[] empatAngka = {07, 10, 20, 23};
    System.out.println(Arrays.toString(empatAngka));

    // Buatlah pendeklarasian array dua dimensi dengan nama ‘Angka’, tipe data String, yang terdiri dari tiga baris dan tiga kolom, isi baris dan kolom berisi angka berikut (1, 3, 5, 14, 19, 20, 22, 27, 29) Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.
    String[][] Angka = {
            {"1", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "29"}
    };
    System.out.println(Arrays.deepToString(Angka));

    // Buatlah deklarasi linked list dengan nama 'listAngka' yang memiliki list (22, 19, 44, 60, 72), Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.
    LinkedList<Integer> listAngka = new LinkedList<Integer>();
    listAngka.add(22);
    listAngka.add(19);
    listAngka.add(44);
    listAngka.add(60);
    listAngka.add(72);

    System.out.println(listAngka);

}

