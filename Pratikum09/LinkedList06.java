public class LinkedList06 {
    Node06 head;
    public boolean isEmpty() {
        return (head == null);
    }
    public void print () {
        if (!isEmpty()) {
            System.out.print("Isi linked list : ");
            Node06 currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void addFirst(int input) {
        Node06 newNode = new Node06(input, null);
         if (isEmpty()) {
            head = newNode;
         } else {
            newNode.next = head;
            head = newNode;
         }
        }
        public void addLast (int input) {
            Node06 newNode = new Node06 (input, null);
            if (isEmpty()) {
                head = newNode;
            } else {
                Node06 currentNode = head;
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = newNode;
            }
        }
        public void insertAfter(int key, int input) {
            Node06 newNode = new Node06 (input, null);
            if (!isEmpty()) {
                Node06 currentNode = head;
                do {
                    if (currentNode.data == key) {
                        newNode.next = currentNode.next;
                        currentNode.next = newNode;
                        //System.out.println("Insert data is succed");
                        break;
                    }
                    currentNode = currentNode.next;
                } while (currentNode != null);
            } else {
                System.out.print("Linked list kosong");
            }
        }
        
        public int getData(int index) {
            Node06 currentNode = head;
            for (int i = 0; i < index; i++) {
                if (currentNode == null) {
                    System.out.println("Index melebihi panjang LinkedList");
                }
                currentNode = currentNode.next;
            }
            if (currentNode == null) {
                System.out.println("Index melebihi panjang LinkedList");
            }
            return currentNode.data;
        }
        
        //public int getData (int index) {
          //  Node06 currentNode = head;
            //for (int i = 0; i < index; i++) {
              //  currentNode = currentNode.next;
                //}
            //return currentNode.data;
        //}
        public int indexOf(int key) {
            Node06 currentNode = head;
            int index = 0;
            while (currentNode != null && currentNode.data != key) {
                currentNode = currentNode.next;
                index++;
            }
            if (currentNode == null) {
                return -1;
            } else {
                return index;
            }
        }
        public void removeFirst () {
            if (!isEmpty()) {
                head = head.next;
            } else {
                System.out.println("Linked list kosong");
            }
        }
        public void removeLast() {
            if (isEmpty()) {
                System.out.println("Linked list kosong");
            } else if (head.next == null) {
                head = null;
            } else {
                Node06 currentNode = head;
                while (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
        public void remove( int key) {
            if (isEmpty()){
                System.out.println("Linked list kosong");
            } else if (head.data == key) {
                removeFirst();
            } else {
                Node06 currentNode = head;
                while (currentNode.next != null) {
                    if (currentNode.next.data == key) {
                        currentNode.next = currentNode.next.next;
                        break;
                    }
                    currentNode = currentNode.next;
                }
            }
        }
        //tugas!
        public void insertAt(int index, int input) {
            Node06 newNode = new Node06(input, null);
            if (index < 0) {
                System.out.println("Index tidak valid");
                return;
            }
            if (index == 0) {
                addFirst(input);
                return;
            }
            Node06 currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                if (currentNode == null) {
                    System.out.println("Index melebihi panjang LinkedList");
                    return;
                }
                currentNode = currentNode.next;
            }
            if (currentNode == null) {
                System.out.println("Index melebihi panjang LinkedList");
                return;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            }
        public void insertBefore(int key, int input) {
            Node06 newNode = new Node06(input, null);
            if (!isEmpty()) {
                if (head.data == key) {
                    newNode.next = head;
                    head = newNode;
                } else {
                    Node06 currentNode = head;
                    while (currentNode.next != null) {
                        if (currentNode.next.data == key) {
                            newNode.next = currentNode.next;
                            currentNode.next = newNode;
                            break;
                        }
                        currentNode = currentNode.next;
                    }
                }
            } else {
                System.out.println("Linked list kosong");
            }
        }
    
        public void removeAt(int index) {
            if (isEmpty()) {
                System.out.println("Linked list kosong");
                return;
            } if (index < 0) {
                System.out.println("Index tidak valid");
                return;
            } if (index == 0) {
                removeFirst();
                return;
            }
            Node06 currentNode = head;
            Node06 prevNode = null;
            int currentIndex = 0;
            while (currentNode != null) {
                if (currentIndex == index) {
                    prevNode.next = currentNode.next;
                    return;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
                currentIndex++;
            }
            System.out.println("Index melebihi panjang LinkedList");
        }
}
