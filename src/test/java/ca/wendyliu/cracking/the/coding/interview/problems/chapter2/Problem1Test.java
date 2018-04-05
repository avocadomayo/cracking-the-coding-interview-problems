package ca.wendyliu.cracking.the.coding.interview.problems.chapter2;

import ca.wendyliu.cracking.the.coding.interview.problems.utils.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1Test {

    @Test
    public void testRemoveDupMySolution() {
        Node<Character> head = new Node<Character>('f');
        head.insert('o');
        head.insert('l');
        head.insert('l');
        head.insert('o');
        head.insert('w');

        Node<Character> result = Problem1.removeDupMySolution(head);
        assertEquals("folw", Node.print(result));
    }

    @Test
    public void testRemoveDupNoBufferMySolution() {
        Node<Character> head = new Node<Character>('f');
        head.insert('o');
        head.insert('l');
        head.insert('l');
        head.insert('o');
        head.insert('w');
        head.insert('u');
        head.insert('p');

        Node<Character> result = Problem1.removeDupNoBufferMySolution(head);
        assertEquals("folwup ", Node.print(result));
    }
}
