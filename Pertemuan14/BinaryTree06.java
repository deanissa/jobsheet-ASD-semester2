public class BinaryTree06 {
    Node06 root;
public BinaryTree06(){
    root = null;
}
boolean isEmpty() {
    return root == null;
}
void add (int data) {
    if(isEmpty()){
        root = new Node06(data);
    } else {
        Node06 current = root;
        while (true) {
            if (data<current.data){
                if(current.left!=null){
                    current = current.left;
                } else {
                    current.left = new Node06(data);
                    break;
                }
            }else if (data>current.data){
                if(current.right != null) {
                    current = current.right;
                } else {
                    current.right = new Node06(data);
                    break;
                }
            } else {
                break;
            }
        }
    }
}
boolean find(int data) {
    boolean hasil = false;
    Node06 current = root;
    while (current != null) {
        if (current.data== data) {
            hasil = true;
            break;
        } else if (data<current.data) {
            current = current.left;
        } else {
            current = current.right;
        }
    }
    return hasil;
}
Node06 getSuccessor (Node06 del) {
    Node06 successor = del.right;
    Node06 successorParent = del;
    while(successor.left != null) {
        successorParent = successor;
        successor = successor.left;
    }
    if (successor !=del.right){
        successorParent.left = successor.right;
        successor.right = del.right;
    }
    return successor;
}
void delete (int data) {
    if(isEmpty()){
        System.out.println("Tree is empty");
        return;
    }
    Node06 parent = root;
    Node06 current = root;
    boolean isLeftChild = false;
    while(current != null){
        if (current.data == data) {
            break;
        } else if (data < current.data) {
            parent = current;
        }
    }
    if (current==null){
        System.out.println("Cloud find data!");
        return;
    } else {
        if (current.left==null&&current.right==null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild){
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left =  current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else if (current.right == null){
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild){
                    parent.left = current.right;
                } else {
                    parent.right = current.left;
                }
            }
        } else {
            Node06 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }
}
public void traversePreOrder(Node06 node) {
    if (node != null) {
        System.out.print(" "+node.data);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}
public void traverseInOrder(Node06 node) {
    if (node != null) {
        traverseInOrder(node.left);
        System.out.print(" "+node.data);
        traverseInOrder(node.right);
    }
}
public void traversePostOrder(Node06 node) {
    if (node != null) {
        traverseInOrder(node.left);
        traverseInOrder(node.right);
        System.out.print(" "+node.data);
    }
}

//Rekursif (Menambahkan Node)
public Node06 addRekursif(Node06 current, int data) {
    if (current == null) {
        return new Node06(data);
    } if (data < current.data) {
        current.left = addRekursif(current.left, data);
    } else if (data > current.data) {
        current.right = addRekursif(current.right, data);
    } 
    return current;
}

// Menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree
public int findMin() {
    if (isEmpty()) {
        throw new IllegalStateException("Tree is empty");
    }
    Node06 current = root;
    while (current.left != null) {
        current = current.left;
    }
    return current.data;
}
public int findMax() {
    if (isEmpty()) {
        throw new IllegalStateException("Tree is empty");
    }
    Node06 current = root;
    while (current.right != null) {
        current = current.right;
    }
    return current.data;
}
//Menampilkan data yang ada di leaf
public void displayLeafNodes(Node06 node) {
    if (node != null) {
        if (node.left == null && node.right == null) {
            System.out.print(" " + node.data);
        }
        displayLeafNodes(node.left);
        displayLeafNodes(node.right);
    }
}
//Menampilkan berapa jumlah leaf yang ada di dalam tree
public int countLeafNodes(Node06 node) {
    if (node == null) {
        return 0;
    }
    if (node.left == null && node.right == null) {
        return 1;
    } else {
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }
}

}