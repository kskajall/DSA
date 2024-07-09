class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class SinglyLinkedList {
    Node head;

    SinglyLinkedList() {
        head = null;
    }

    void addFirst(int x) {
        Node node = new Node(x);

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    void addLast(int x) {
        Node node = new Node(x);

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void addAtIndex(int x, int index) {

        if (index < 0 || index > sizeOfLL()){
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
            temp = null;
        }
    }

    void removeLast() {
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp1 = head;
            Node temp2 = head.next;
            while (temp2.next != null) {
                temp1 = temp2;
                temp2 = temp2.next;
            }
            temp1.next = null;
            temp2 = null;

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
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    void getAtIndex(int index) {
        if (index < 0 || index > sizeOfLL() - 1) {
            System.out.println("Can not get any element at given index.");
        }else {
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
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("END");
        }
    }

    int sizeOfLL() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    int sumOfLL() {
        int sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        return  sum;
    }

    int maxOfLL () {
        int max = Integer.MIN_VALUE;
        Node temp = head;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }

    int search(int x) {
        int index = -1;
        int i = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == x) {
                index = i;
            }
            i++;
            temp = temp.next;
        }
        return index;
    }

    void reverseLL() {
        Node temp = head;
        Node previous = null;
        Node current = null;

        while(temp != null) {
            current = temp.next;
            temp.next = previous;
            previous = temp;
            temp = current;
        }
        head = previous;
    }
}