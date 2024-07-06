package tugas2;

import java.util.Scanner;

public class FilmMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilmDoubleLinkedList filmList = new FilmDoubleLinkedList();
        while (true) {
            System.out.println("======================================");
            System.out.println("DATA FILM LAYAR LEBAR ");
            System.out.println("======================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data di Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data di Index Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari Film berdasarkan ID");
            System.out.println("9. Urut Data Rating FILM-DESC");
            System.out.println("10. Keluar");
            System.out.println("======================================");
            System.out.print("Pilih menu: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("ID Film: ");
                    int id1 = sc.nextInt();
                    System.out.println("Judul Film: ");
                    sc.nextLine(); 
                    String title1 = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double rating1 = sc.nextDouble();
                    filmList.addFirst(id1, title1, rating1);
                    System.out.println("Film berhasil ditambahkan di awal.");
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.println("ID Film: ");
                    int id2 = sc.nextInt();
                    System.out.println("Judul Film: ");
                    sc.nextLine(); 
                    String title2 = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double rating2 = sc.nextDouble();
                    filmList.addLast(id2, title2, rating2);
                    System.out.println("Film berhasil ditambahkan di akhir.");
                    break;
                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.print("ID Film: ");
                    int id3 = sc.nextInt();
                    System.out.println("Judul Film: ");
                    sc.nextLine(); 
                    String title3 = sc.nextLine();
                    System.out.println("Rating Film: ");
                    double rating3 = sc.nextDouble();
                    System.out.println("Data Film ini akan masuk di urutan ke-");
                    int index3 = sc.nextInt();
                    filmList.add(id3, title3, rating3, index3-1);
                    System.out.println("Film berhasil ditambahkan di indeks " + index3 + ".");
                    break;
                case 4:
                    filmList.removeFirst();
                    System.out.println("Film pertama berhasil dihapus.");
                    break;
                case 5:
                    filmList.removeLast();
                    System.out.println("Film terakhir berhasil dihapus.");
                    break;
                case 6:
                    System.out.print("Masukkan indeks film yang ingin dihapus: ");
                    int index6 = sc.nextInt();
                    filmList.remove(index6);
                    System.out.println("Film di indeks " + index6 + " berhasil dihapus.");
                    break;
                case 7:
                    filmList.displayFilms();
                    break;
                case 8:
                    System.out.println("Cari Data");
                    System.out.print("Masukkan ID Film yang dicari: ");
                    int searchId =sc.nextInt();
                    Film searchedFilm = filmList.searchFilm(searchId);
                    if (searchedFilm != null) {
                        System.out.println("IDENTITAS: ");
                        System.out.println("ID: " + searchedFilm.id);
                        System.out.println("Judul: " + searchedFilm.title);
                        System.out.println("Rating: " + searchedFilm.rating);
                    } else {
                        System.out.println("Film dengan ID " + searchId + " tidak ditemukan.");
                    }
                    break;
                case 9 :
                    filmList.sortDescending();
                    System.out.println("Film berhasil diurutkan secara descending berdasarkan rating.");
                    break;
                case 10:
                    System.out.println("Terima kasih telah menggunakan program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        }
    }
}

