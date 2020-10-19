package tp6;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class testFoobarMethod {

    SUT test;

    @BeforeEach
    public void init() {
        test = new SUT() ;
    }

    @Test
    public void doestItThrowAnException() {
        assertDoesNotThrow(() -> {test.foobar() ; });
    }

    @Test
    public void shouldThrowAnException() {
        assertThrows(FooBarException.class, () -> {new SUT(-1, 2, 4).foobar(); });
    }

    @Test
    public void shouldNotThrowAnException() {
        assertDoesNotThrow(() -> {new SUT(1, 2, 4).foobar(); });
    }
}

