/**
 * tugasSatu
 */
import java.util.Scanner;
public class tugasSatu {
    public static void main(String[] args) {
        //Array Kode Plat dan Kota
        String [] kodePlat = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String [][] kota = {
        {"B", "A", "N", "T", "E", "N"},
        {"J", "A", "K", "A", "R", "T", "A"}, 
        {"B", "A", "N", "D", "U", "N", "G"},
        {"C", "I", "R", "E", "B", "O", "N"},
        {"B", "O", "G", "O", "R"},
        {"P", "E", "N", "K", "A", "L", "O", "N", "G", "A", "N"},
        {"S", "E", "M", "A", "R", "A", "N", "G"},
        {"S", "U", "R", "A", "B", "A", "Y", "A"},
        {"M", "A", "L", "A", "N", "G"},
        {"T", "E", "G", "A", "L"}
    };

    Scanner sc = new Scanner (System.in);
    System.out.print("Masukkan kode plat mobil : ");
    String input = sc.nextLine();

    int index = -1;
    for (int i = 0; i < kodePlat.length; i++) {
        if (kodePlat[i].equals(input)) {
            index = i;
            break;
        }
    }
    if (index != -1) {
        System.out.println("Kota yang berhubungan dengan kode plat : " + input + " adalah :");
        for (int i = 0; i < kota[index].length; i++) {
            System.out.println(kota[index][i]);
        }
    } else {
        System.out.println("Kode plat tidak valid.");
    }
}
}