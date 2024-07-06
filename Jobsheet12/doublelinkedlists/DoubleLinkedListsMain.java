package doublelinkedlists;
/**
 * DoubleLinkedListsMain
 */
public class DoubleLinkedListsMain {

    public static void main(String[] args) throws Exception {
        DoubleLinkedLists06 dll = new  DoubleLinkedLists06();
        //dll.addLast(50);
        //dll.addLast(40);
        //dll.addLast(10);
        //dll.addLast(20);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("========================================");
        //dll.removeFirst();
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("========================================");
        //dll.removeLast();
        dll.add(40,1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("========================================");
        System.out.println("Data awal pada linked adalah : " +dll.getFirst());
        System.out.println("Data akhir pada linked adalah : " +dll.getLast());
        System.out.println("Data awal pada linked adalah : " +dll.get(1));
        //dll.remove(1);
        //dll.clear();
        //dll.print();
        //System.out.println("Size : "+dll.size());
    }
}