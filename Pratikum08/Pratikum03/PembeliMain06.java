package Pratikum03;
import java.util.Scanner;
public class PembeliMain06 {

        public static void menu () {
            System.out.println("Pilih Menu :");
            System.out.println("1. Antrian Baru");
            System.out.println("2. Antrian Keluar");
            System.out.println("3. Cek Antrian Terdepan");
            System.out.println("4. Cek Semua Antrian");
            System.out.println("5. Cek Antrian Terbelakang");
            System.out.println("6. Menampilkan Antrian Berdasarkan (nama)");
            System.out.println("7. Menampilkan Semua Antrian");
            System.out.println("----------------------------------");
        }
            public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);
                System.out.print("Masukkan kapasitas : ");
                int n = sc.nextInt();
                QueuePembeli06 antri = new QueuePembeli06(n);
                int pilih;
                do {
                    menu();
                    pilih = sc.nextInt();
                    sc.nextLine();
                    switch (pilih){
                        case 1 : 
                        System.out.print("Nama : ");
                        String nama = sc.nextLine();
                        System.out.print("No ID : ");
                        int noID = sc.nextInt();
                        System.out.print("Jenis Kelamin (L/P) : ");
                        char jenisKelamin = sc.next().charAt(0);
                        System.out.print("Umur : ");
                        int umur = sc.nextInt();
                        Pembeli06 nb = new Pembeli06 (nama, noID, jenisKelamin, umur);
                        sc.nextLine();
                        antri.Enqueue(nb);
                        break;
                        case 2 :
                        Pembeli06 antrian = antri.Dequeue();
                        if (!"".equals(antrian.nama) && !"".equals(antrian.noID) && !"".equals(antrian.jenisKelamin)
                        && antrian.umur !=0) {
                            System.out.println("Antrian yang keluar : " + antrian.nama + " " +antrian.noID + " " + antrian.jenisKelamin + " " + antrian.umur);
                            break;
                        }
                        case 3 :
                        antri.peek();
                        break;
                        case 4 :
                        antri.print();
                        break;
                        case 5:
                        antri.peekRear(); 
                        break;
                        case 6 :
                        System.out.print("Nama yang dicari: ");
                        String namaCari = sc.nextLine();
                        antri.peekPosition(namaCari);
                        break;
                        case 7 :
                        antri.daftarPembeli();

                    }
                } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
            }
        }
