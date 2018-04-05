package ca.wendyliu.cracking.the.coding.interview.problems.chapter2;

import ca.wendyliu.cracking.the.coding.interview.problems.utils.Node;

public class Problem2 {

    public static Node kThToLastMySolution(Node head, int k) {
        if (head == null || k < 0) {
            return null;
        }

        Node n = head;
        Node n2 = head;
        int total = 0;

        // calculate total nodes
        while (n != null) {
            total++;
            n = n.next;
        }

        int i = 1;
        while (i < total - k) {
            i++;
            n2 = n2.next;
        }

        return n2;
    }

    public static Node kThToLastTwoPointersMySolution(Node head, int k) {
        // k is space between two pointers
        int i = 0;
        Node first = head;
        Node second = head;
        while (first.next != null) {
            i++;

            first = first.next;
            if (i > k) {
                second = second.next;
            }
        }

        return second;
    }

    public static Node kThToLastRecursiveSolution(Node head, int k) {
        Index idx = new Index();
        return kThToLastRecursiveSolution(head, k, idx);
    }

    private static Node kThToLastRecursiveSolution(Node head, int k, Index idx) {
        if (head == null) {
            return null;
        }

        Node node = kThToLastRecursiveSolution(head.next, k, idx);
        idx.value = idx.value + 1;
        if (idx.value == k + 1) {
            return head;
        }

        return node;
    }

    static class Index {
        int value = 0;
    }
}
