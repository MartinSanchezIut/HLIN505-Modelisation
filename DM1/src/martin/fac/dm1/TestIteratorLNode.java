package martin.fac.dm1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class TestIteratorLNode {

    LNode<String> root=new LNode<>("root");
    LNode<String> right;
    LNode<String> left;
    Iterator<LNode<String>> iterator;

    @BeforeEach
    public void init() {

        left=root.addNewLeftNode("fils1", "1");
        right=root.addNewRightNode("fils2", "2");

        iterator = root.iterator();

        System.out.println(root.dfsdump());
    }

    @Test
    void testIfHasNext() {
        assertTrue(root.iterator().hasNext());
    }

    @Test
    void testIfThrowException() {
        while (iterator.hasNext()){
            assertDoesNotThrow(() -> {iterator.next(); });
        }
        assertThrows(EmptyStackException.class, () -> {iterator.next() ; });
    }

    @Test
    void testLTree3Nodes() {
        StringBuilder s = new StringBuilder();
        while (iterator.hasNext()){
            s.append(iterator.next().getLabel());
        }
        assertEquals("rootfils1fils2",s.toString());
    }


    @Test
    void testLTrees6nodes() {
        LNode<String> autre= left.addNewLeftNode("fils3", "3");
        autre.addNewLeftNode("fils4", "4");
        autre.addNewRightNode("fils5", "5");

        StringBuilder s = new StringBuilder();
        while (iterator.hasNext()){
            s.append(iterator.next().getLabel());
        }

        assertEquals("rootfils1fils3fils4fils5fils2", s.toString());
    }


}