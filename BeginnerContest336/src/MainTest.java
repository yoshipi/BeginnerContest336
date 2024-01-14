import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
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

        String str = "1";

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        Main.main(null);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0");
        stringBuilder.append(System.lineSeparator());
        String expect = stringBuilder.toString();

        Assert.assertEquals(expect, stdOut.toString());

    }

    @Test
    public void Test2() throws Exception {

        String str = "5";

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        Main.main(null);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("8");
        stringBuilder.append(System.lineSeparator());
        String expect = stringBuilder.toString();

        Assert.assertEquals(expect, stdOut.toString());

    }

    @Test
    public void Test3() throws Exception {

        String str = "8";

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        Main.main(null);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("24");
        stringBuilder.append(System.lineSeparator());
        String expect = stringBuilder.toString();

        Assert.assertEquals(expect, stdOut.toString());

    }

    @Test
    public void Test4() throws Exception {

        String str = "133";

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        Main.main(null);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("2024");
        stringBuilder.append(System.lineSeparator());
        String expect = stringBuilder.toString();

        Assert.assertEquals(expect, stdOut.toString());

    }

    @Test
    public void Test5() throws Exception {

        String str = "31415926535";

        InputStream input = new ByteArrayInputStream(str.getBytes());
        System.setIn(input);

        Main.main(null);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("2006628868244228");
        stringBuilder.append(System.lineSeparator());
        String expect = stringBuilder.toString();

        Assert.assertEquals(expect, stdOut.toString());

    }

}
