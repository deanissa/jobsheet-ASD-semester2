public class SortingMain {
    public static void main(String[] args) {
        int data [] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan Merge Sort");
        MergeSorting mSort= new MergeSorting ();
        System.out.println("Data Awal");
        mSort.printArray (data);
        mSort.mergeSort (data);
        System.out.println("Setelah Diurutkan");
        mSort.printArray (data);
        //int [] daftarNilai = {10, 5, 20, 15, 5, 45};
        //Sorting.sequentialSearch (daftarNilai, 5);

        //int [] sortedNilai = {5, 5, 10, 20, 30, 40, 50};
        //int index = Sorting.binarySearchAsc(sortedNilai, 5);
        
        //if (index != -1) {
          //  System.out.println("Data ditemukan pada indeks ke- " +index);
        //} else {
          //  System.out.println("Data tidak ditemukan");
        //}
    }
}
