package ca.wendyliu.cracking.the.coding.interview.problems.chapter2;

import ca.wendyliu.cracking.the.coding.interview.problems.utils.Node;

import java.util.HashSet;

public class Problem1 {

    // takes O(n^2) time
    public static Node<Character> removeDupMySolution(Node<Character> input) {
        HashSet<Character> buffer = new HashSet<Character>();

        Node<Character> curr = input;
        Node<Character> prev = null;
        Character c;
        while (curr.next != null) {
            c = curr.data;
            if (!buffer.contains(c)) {
                buffer.add(c);
                prev = curr;
                curr = curr.next;
            } else {
                while (buffer.contains(curr.data)) {
                    curr = curr.next;
                }
                if (prev != null) {
                    prev.next = curr;
                }
            }

        }

        return input;
    }

    public static Node<Character> removeDupNoBufferMySolution(Node<Character> input) {
        if (input == null || input.next == null) {
            return input;
        }

        Node<Character> curr = input;
        Node<Character> first;
        Node<Character> second;

        while (curr.next != null) {
            first = curr.next;
            second = curr;
            while (first.next != null) {
                if (first.data == curr.data) {
                    while (first.data == curr.data) {
                        first = first.next;
                    }
                    second.next = first;
                } else {
                    second = first;
                    first = first.next;
                }
            }

            curr = curr.next;
        }

        return input;
    }

    // solution. O(n) time
    public static void deleteDups(Node<Integer> n) {
        HashSet<Integer> set = new HashSet<Integer>();
        Node<Integer> previous = null;
        while (n != null) {
            if (set.contains(n.data)) {
                previous.next = n.next;
            } else {
                set.add(n.data);
                previous = n;
            }

            n = n.next;
        }
    }

    // solution without buffer. O(n^2) time, O(1) space
    public static void deleteDupsNoBuffer(Node<Integer> head) {
        Node<Integer> current = head;
        while (current != null) {
            // remove all future node that have the same value
            Node<Integer> runner = current;
            while (runner.next != null) {
                if (runner.next.data.equals(current.data)) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }
    }
}
