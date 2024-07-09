public class DoubleEndedQueue {
    int[] deQueue;
    int front, rear, size;
    DoubleEndedQueue (int n) {
        size = n;
        front = -1;
        rear = -1;
        deQueue = new int[size];
    }

    void insertAtRear (int x) {
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
        deQueue[rear] = x;
    }

    void deleteFromFront () {
        if (front == -1) {
            System.out.println("Queue underflow. Can not delete.");
        } else {
            int temp = deQueue[front];
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


    void insertAtFront (int x) {
        if ((front == 0 && rear == size - 1) || rear == front - 1) {
            System.out.println("Queue overflow. Can not add");
        } else {
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (front == 0) {
                front = size - 1;
            } else {
                front--;
            }
            deQueue[front] = x;
        }
    }

    void deleteFromRear () {
        if (front == -1) {
            System.out.println("Queue underflow. Can not delete.");
        } else {
            int temp = deQueue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (rear == 0) {
                rear = size - 1;
            } else {
                rear--;
            }
        }
    }

    void display () {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            if (rear < front) {
                for (int i = front; i < size; i++) {
                    System.out.print(deQueue[i] + " -> ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(deQueue[i] + " -> ");
                }
                System.out.println("End");
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(deQueue[i] + " -> ");
                }
                System.out.println("End");
            }
        }
    }
}
