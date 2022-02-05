package lesson14Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calcの正常系() throws Exception {
        assertThat(Calculator.calc(100, 1), is(100));
    }

    @Test
    public void calcの準正常系() throws Exception {
        assertThat(Calculator.calc(-100, 1), is(-100));
    }

    @Test(expected = Exception.class)
    public void calcの異常系() throws Exception {
        assertThat(Calculator.calc(100, 0), is(0));
    }

}
