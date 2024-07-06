public class BinaryArrayMain06 {
    public static void main(String[] args) {
        BinaryTreeArray06 bta = new BinaryTreeArray06();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);

        System.out.print("In-order : ");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.print("Pre-order : ");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.print("Post-order : ");
        bta.traversePostOrder(0);
        System.out.println();
    }
}


