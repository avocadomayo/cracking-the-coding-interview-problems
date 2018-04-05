package ca.wendyliu.cracking.the.coding.interview.problems.chapter2;

import ca.wendyliu.cracking.the.coding.interview.problems.utils.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    @Test
    public void testKThToLastMySolution() {
        Node<Character> head = new Node<Character>('a');
        head.insert('p');
        head.insert('p');
        head.insert('l');
        head.insert('e');

        // System.out.println(Node.print(head));
        Node<Character> result = Problem2.kThToLastMySolution(head, 4);
        assertEquals('a', (char) result.data);
    }

    @Test
    public void testKThToLastTwoPointersMySolution() {
        Node<Character> head = new Node<Character>('a');
        head.insert('p');
        head.insert('p');
        head.insert('l');
        head.insert('e');

        // System.out.println(Node.print(head));
        Node<Character> result = Problem2.kThToLastTwoPointersMySolution(head, 4);
        assertEquals('a', (char) result.data);
    }

    @Test
    public void testKThToLastSolution() {
        Node<Character> head = new Node<Character>('a');
        head.insert('p');
        head.insert('p');
        head.insert('l');
        head.insert('e');

        Node<Character> result = Problem2.kThToLastRecursiveSolution(head, 4);
        assertEquals('a', (char) result.data);
    }
}