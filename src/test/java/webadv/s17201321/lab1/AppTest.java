package webadv.s17201321.lab1;

import org.junit.Assert;
import org.junit.Test;
public class AppTest {
    private String username = "wuxinyue";
    private String password = "17201321";
    @Test
    public void testLength() {
        Assert.assertEquals(64,App.sha256hex(password).length());
    }
    @Test
    public void testHex() {
        String expected = "563badba8a110077e0a67b0a4c13b4d316795dfde85d94fdfdf2bea0672d4ed5";
        Assert.assertEquals(expected,App.sha256hex(password));
        Assert.assertEquals("wuxinyue",username);
    }
}