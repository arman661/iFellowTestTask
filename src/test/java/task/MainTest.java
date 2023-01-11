package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Testsa
    void findValidBracketsTest1() {
        assertEquals("2 - ()", Main.findValidBrackets("(()"));
    }

    @Test
    void findValidBracketsTest2() {
        assertEquals("4 - ()()", Main.findValidBrackets(")()())"));
    }
asad
    @Test
    void findValidBracketsTest3() {
        assertEquals("6 - (()())", Main.findValidBrackets(")(()())"));
    }

    @Test
    void findValidBracketsTest4() {
        assertEquals("0", Main.findValidBrackets(")("));
    }

    @Test
    void findValidBracketsTest5() {
        assertEquals("10 - ()(()())()", Main.findValidBrackets("())(()())(()"));
    }
}
