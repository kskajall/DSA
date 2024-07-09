class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class circularLinkedList {
    Node head;
    Node tail;

    circularLinkedList() {
        head = null;
        tail = null;
    }

    void addLast(int x) {
        Node node = new Node(x);

        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
        } else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
    }

    void addFirst(int x) {
        Node node = new Node(x);

        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
        } else {
            node.next = head;
            head = node;
            tail.next = head;
        }
    }

    void addAtIndex(int x, int index) {

        if (index < 0 || index > sizeOfLL()) {
            System.out.println("Can not add at given index.");
        } else if (index == 0) {
            addFirst(x);
        } else if (index == sizeOfLL()) {
            addLast(x);
        } else {
            Node node = new Node(x);

            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
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
        if (index < 0 || index > sizeOfLL() - 1) {
            System.out.println("Can not remove at given index.");
        } else if (index == 0) {
            removeFirst();
        } else if (index == sizeOfLL() - 1) {
            removeLast();
        } else {
            Node temp = head;

            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
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


    void display() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node temp = head;
            do {
                System.out.print(temp.data + "->");
                temp = temp.next;
            } while (temp != head);
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

    int sumOfLL() {
        int sum = 0;
        Node temp = head;
        do {
            sum += temp.data;
            temp = temp.next;
        } while (temp != head);
        return sum;
    }

    int maxOfLL() {
        int max = Integer.MIN_VALUE;
        Node temp = head;
        do {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        } while (temp != head);
        return max;
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
