public class Main {
    public static void main(String args[]) {

        SinglyLinkedList object = new SinglyLinkedList();

        object.addFirst(10);
        object.addLast(20);
        object.addLast(30);
        object.addLast(40);
        object.addLast(50);
        object.addLast(60);
        object.display();
        object.addAtIndex(40,3);
        object.display();
        object.removeFirst();
        object.display();
        object.removeLast();
        object.display();
        object.removeAtIndex(7);
        object.display();
        object.getFirst();
        object.getLast();
        object.getAtIndex(0);
        System.out.println(object.search(30));
        object.reverseLL();
        object.display();
        System.out.println(object.sizeOfLL());
        System.out.println(object.sumOfLL());
        System.out.println(object.maxOfLL());



        doublyLinkedList object = new doublyLinkedList();

        object.addLast(10);
        object.addLast(20);
        object.addLast(30);
        object.addLast(50);
        object.forwardDisplay();
        object.addFirst(5);
        object.forwardDisplay();
        object.addAtIndex(40,4);
        object.forwardDisplay();
        object.removeFirst();
        object.forwardDisplay();
        object.removeLast();
        object.removeAtIndex(2);
        object.forwardDisplay();
        object.backwardList();
        object.getFirst();
        object.getLast();
        object.getAtIndex(2);
        System.out.println(object.sizeOfLL());
        System.out.println(object.sumOfLL());
        System.out.println(object.maxOfLL());
        System.out.println(object.search(30));


        circularLinkedList object = new circularLinkedList();

        object.addLast(10);
        object.addLast(20);
        object.addLast(30);
        object.addLast(40);
        object.display();
        object.addFirst(5);
        object.display();
        object.addAtIndex(50,5);
        object.display();
        object.removeFirst();
        object.display();
        object.removeLast();
        object.display();
        object.removeAtIndex(2);
        object.display();
        object.getFirst();
//        object.getLast();
        object.getAtIndex(2);
        System.out.println(object.sizeOfLL());
        System.out.println(object.sumOfLL());
        System.out.println(object.maxOfLL());
        System.out.println(object.search(10));






        circularDoublyLL object = new circularDoublyLL();
        object.addLast(10);
        object.addLast(20);
        object.addLast(30);
        object.addLast(40);
        object.addFirst(5);
        object.forwardDisplay();
        object.addAtIndex(40,3);
        object.removeFirst();
        object.removeLast();
        object.removeAtIndex(3);
        object.forwardDisplay();
        object.backwardDisplay();
        System.out.println(object.sizeOfLL());
        object.getFirst();
        object.getLast();
        object.getAtIndex(2);
        object.search(30);






        arrayStack obj = new arrayStack(5);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.display();
        System.out.println(obj.size);
        obj.peek();








        queue object = new queue();

        object.enQueue(10);
        object.enQueue(20);
        object.enQueue(30);
        object.enQueue(40);
        object.enQueue(50);
        object.display();
        object.dQueue();
        object.display();
        System.out.println(object.size());
        object.peek();








        ArrayQueue object = new ArrayQueue(5);
        object.enQueue(10);
        object.enQueue(20);
        object.enQueue(30);
        object.enQueue(40);
        object.enQueue(50);
        object.display();
        object.delQueue();
        object.peek();






        CircularQueue object = new CircularQueue(5);
        object.enQueue(10);
        object.enQueue(20);
        object.enQueue(30);
        object.enQueue(40);
        object.enQueue(50);
        object.display();
        object.delQueue();
        object.display();







        DoubleEndedQueue object = /* new DoubleEndedQueue(5);

        object.insertAtFront(10);
        object.insertAtFront(20);
        object.insertAtFront(30);
        object.insertAtFront(40);
        object.display();
        object.insertAtRear(5);
        object.display();
        object.deleteFromRear();
        object.display();
        object.deleteFromFront();
        object.display();

    }
}
