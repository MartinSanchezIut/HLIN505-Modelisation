package martin.fac.dm1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTreesWithStringLabels {

    LNode<String> root=new LNode<>("root");
    LNode<String> right;
    LNode<String> left;

    @BeforeEach
    public void init() {
        left=root.addNewLeftNode("fils1", "1");
        right=root.addNewRightNode("fils2", "2");
    }
    @Test
    void testLTrees3nodes() {
        assertEquals("root 1 fils1 2 fils2", root.dfsdump());
    }

    @Test
    void testLTrees4nodes() {
        left.addNewLeftNode("fils3", "3");
        assertEquals("root 1 fils1 3 fils3 2 fils2", root.dfsdump());
    }

    @Test
    void testLTrees6nodes() {
        LNode<String> autre= left.addNewLeftNode("fils3", "3");
        autre.addNewLeftNode("fils4", "4");
        autre.addNewRightNode("fils5", "5");
        assertEquals("root 1 fils1 3 fils3 4 fils4 5 fils5 2 fils2", root.dfsdump());
    }


}
