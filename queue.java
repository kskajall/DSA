class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

class queue {
    Node front;
    queue() {
        front = null;
    }

    void enQueue(int x) {
        Node rear = new Node(x);
        if (front == null) {
            front = rear;
        } else {
            Node temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = rear;
        }
    }

    void dQueue() {
        if (front == null) {
            System.out.println("Queue underflow, can not delete.");
        } else {
            Node temp = front;
            front = front.next;
            temp = null;
        }
    }

    int size() {
        int size = 0;
        Node temp = front;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size++;
    }

    void peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println(front.data);
        }
    }

    void display() {

        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("End");
        }
    }
}
