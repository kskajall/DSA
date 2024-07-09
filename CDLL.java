class Node {
    int data;
    Node next, prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
class circularDoublyLL {
    Node head, tail;

    circularDoublyLL() {
        head = null;
        tail = null;
    }

    void addLast(int x) {
        Node node = new Node(x);

        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
            head.prev = tail;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = head;
            head.prev = tail;
        }
    }

    void addFirst(int x) {
        Node node = new Node(x);

        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
            head.prev = tail;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
            head.prev = tail;
            tail.next = head;
        }
    }

    void addAtIndex(int x, int index) {

        if (index < 0 || index > sizeOfLL() - 1) {
            System.out.println("Can not get any element at given index.");
        } else {
            Node node = new Node(x);
            Node temp = head;

            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            node.prev = temp;
            temp.next = node;
        }
    }

    void removeFirst() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node temp = head;
            head = head.next;
            tail.next = head;
            temp = null;
        }
    }

    void removeLast() {
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = null;
        }
    }

    void removeAtIndex(int index) {
        if (index == 0 || index > sizeOfLL() - 1) {
            System.out.println("Can not remove at given index.");
        } else if (index == 0) {
            removeFirst();
        } else if (index == sizeOfLL() - 1) {
            removeLast();
        } else {
            Node temp1 = head;
            Node temp2 = head.next;

            for (int i = 1; i < index; i++) {
                temp1 = temp2;
                temp2 = temp2.next;
            }
            temp1.next = temp2.next;
            temp1.next.prev = temp1;
            temp2 = null;
        }
    }

    void getFirst() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            System.out.println(head.data);
        }
    }

    void getLast() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            System.out.println(tail.data);
        }
    }


    void getAtIndex(int index) {
        if (index < 0 || index > sizeOfLL() - 1) {
            System.out.println("Can not get any element at given index.");
        } else {
            Node temp = head;

            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

    }

    void forwardDisplay() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node temp = head;

            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("END");
        }
    }

    void backwardDisplay() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node temp = tail;

            do {
                System.out.print(temp.data + " -> ");
                temp = temp.prev;
            } while (temp != tail);
            System.out.println("END");
        }
    }

        int sizeOfLL() {
        Node temp = head;
        int size = 0;
        do {
            size++;
            temp = temp.next;
        } while (temp != head);
        return size;
    }

    int search(int x) {
        int index = -1;
        int i = 0;
        Node temp = head;

        do {
            if (temp.data == x) {
                index = i;
                break;
            }
            i++;
            temp = temp.next;
        } while (temp != head);
        return index;
    }
}
