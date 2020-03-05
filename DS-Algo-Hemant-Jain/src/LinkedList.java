public class LinkedList {
//    linked list and tree have their nodes different.
//    so it is best to declare their corresponding nodes class inside their own class
//    to prevent name conflict and increase encapsulation.
    private static class Node {
        private int value;
        private Node next;
    }
    private Node head;
}
