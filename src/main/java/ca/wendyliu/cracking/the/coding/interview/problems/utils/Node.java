package ca.wendyliu.cracking.the.coding.interview.problems.utils;

/** A singly linked list */
public class Node<E> {

    public E data;
    public Node<E> next;

    public Node(E element) {
        this.data = element;
    }

    public void insert(E element) {
        Node end = new Node<E>(element);
        Node node = this;

        while (node.next != null) {
            node = node.next;
        }

        node.next = end;
    }

    public static String print(Node head) {
        if (head == null) {
            return "";
        }

        return head.data + print(head.next);
    }
}
