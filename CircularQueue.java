public class CircularQueue {
    int[] cQueue;
    int front, rear, size;
    CircularQueue (int n) {
        size = n;
        front = -1;
        rear = -1;
        cQueue = new int[size];
    }

    void enQueue (int x) {
        if ((front == 0 && rear == size - 1) || (rear == front - 1)) {
            System.out.println("Queue overflow. Can not add.");
        } else {
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (rear == size - 1) {
                rear = 0;
            } else {
                rear++;
            }
        }
        cQueue[rear] = x;
    }

    void delQueue () {
        if (front == -1) {
            System.out.println("Queue underflow. Can not delete.");
        } else {
            int temp = cQueue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == size - 1) {
                front = 0;
            } else {
                front++;
            }
        }
    }

    void display () {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            if (rear < front) {
                for (int i = front; i < size; i++) {
                    System.out.print(cQueue[i] + " -> ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(cQueue[i] + " -> ");
                }
                System.out.println("End");
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(cQueue[i] + " -> ");
                }
                System.out.println("End");
            }
        }
    }
}
