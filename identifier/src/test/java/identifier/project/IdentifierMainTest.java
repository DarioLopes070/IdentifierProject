package identifier.project;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IdentifierMainTest {
    static private ByteArrayOutputStream baOut;
    static private PrintStream psOut;

    @BeforeClass
    public static void beforeClassInit() {
        baOut = new ByteArrayOutputStream();
        psOut = new PrintStream(baOut);
        System.setOut(psOut);
    }

    @AfterClass
    public static void afterClassFinalize() {
        psOut.close();
    }

    @Before
    public void setUp() {
        baOut.reset();
    }

    @Test
    public void testvalido01() {
        IdentifierMain.main(new String[] { "a1" });
        String output = baOut.toString();

        assertEquals("Valido", output);
    }
}