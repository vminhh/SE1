package tut04.modify_string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {
    @Test
    public void testModifyStringValidInput() throws Exception{
        assertEquals("Hello", StringUtil.ModifyString("h ell o"));
    }
}
