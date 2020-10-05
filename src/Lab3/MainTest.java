package Lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    void isBalancedForABalancedExpression(){
        String exp = "( a + b * { c / (d - e ) } + { d / e } )";
        boolean actual = Main.isBalanced(exp);
        assertTrue(actual);
    }

    @Test
    void isBalancedParenthesesNotMatching(){
        String exp = "( a + b * { c / (d - e ) ) + { d / e]";
        boolean actual = Main.isBalanced(exp);
        assertFalse(actual);
    }

    @Test
    void isBalancedNotEnoughCloseParentheses(){
        String exp = "( a + b * ( c / (d - e ) )) + { d / e";
        boolean actual = Main.isBalanced(exp);
        assertFalse(actual);
    }

    @Test
    void isBalancedNotEnoughOpenParentheses(){
        String exp = " a + b )";
        boolean actual = Main.isBalanced(exp);
        assertFalse(actual);
    }

    @Test
    void isBalancedNoParentheses(){
        String exp = "a + b = c";
        boolean actual = Main.isBalanced(exp);
        assertTrue(actual);
    }
}
