public class ArrayQueue {
    int front, rear, size;
    int queue[];
    ArrayQueue(int n) {
        size = n;
        front = -1;
        rear = -1;
        queue = new int[size];
    }

    void enQueue (int x) {
        if (rear == size - 1) {
            System.out.println("Queue overflow. Can not add.");
        } else if (front == -1) {
            rear = 0;
            front = 0;
            queue[rear] = x;
        } else {
            rear++;
            queue[rear] = x;
        }
    }

    void delQueue () {
        if (front == -1){
            System.out.println("Queue underflow. Can not delete.");
        } else {
            int temp = queue[front];
            front++;
            System.out.println("Deleted Value: " + temp);
        }
    }

    void peek() {
        if (front == -1){
            System.out.println("Queue is empty.");
        } else {
            System.out.println(queue[front]);
        }
    }

    void display () {
        if (front == -1){
            System.out.println("Queue is empty.");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " -> ");
            }
            System.out.println("End");
        }
    }
}
