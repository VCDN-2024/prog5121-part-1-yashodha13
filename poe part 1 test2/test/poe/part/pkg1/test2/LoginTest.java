package poe.part.pkg1.test2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LoginTest {
    
    Login login = new Login();

    @Test
    public void testCheckUsernameformattedCorrectly() {
        boolean actual = login.checkUsername("Kyl_1");
        assertTrue(actual);
    }

    @Test
    public void testCheckUsernameNotformattedCorrectly() {
        boolean actual = login.checkUsername("Kyle_!!!!!!!");
        assertFalse(actual);
    }

    @Test
    public void testCheckPasswordComplexityformattedCorrectly() {
        boolean actual = login.checkPasswordComplexity("Ch&&sec@ke9");
        assertTrue(actual);
    }
        
    @Test
    public void testCheckPasswordNotformattedCorrectly() {
        boolean actual = login.checkPasswordComplexity("password");
        assertFalse(actual);
    }   
}
