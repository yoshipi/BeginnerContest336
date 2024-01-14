import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProblemTest2 {
    private ByteArrayOutputStream stdOut = new ByteArrayOutputStream();
    private ByteArrayOutputStream errOut = new ByteArrayOutputStream();

    @Before
    public void before() {
        System.setOut(new PrintStream(stdOut));
        System.setErr(new PrintStream(errOut));
    }

    @After
    public void after() {
        System.setIn(null);
        System.setOut(null);
    }

    @Test
    public void Test1() throws Exception {

        String str = "2024";

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        Problem2.main(null);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("3");
        stringBuilder.append(System.lineSeparator());
        String expect = stringBuilder.toString();

        Assert.assertEquals(expect, stdOut.toString());

    }

}
