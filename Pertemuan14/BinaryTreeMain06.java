/**
 * BinaryTreeMain06
 */
public class BinaryTreeMain06 {

    public static void main(String[] args) {
        BinaryTree06 bt = new BinaryTree06();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(11);

        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        //System.out.println("Find " + bt.find(5));
        //bt.delete(8);
        //bt.traversePreOrder(bt.root);
        //System.out.println("");

        System.out.println("Min : " + bt.findMin());
        System.out.println("Max : " + bt.findMax());

        System.out.println("Leaf :");
        bt.displayLeafNodes(bt.root);
        System.out.println();

        System.out.println("Jumlah Leaf: " + bt.countLeafNodes(bt.root));
    }
}