package demo.parallel;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class ComplexTest {
    @Test
    public void div() {
        Complex a = new Complex(4, 2);
        Complex b = new Complex(2, 1);

        Complex expected = new Complex(2.0, 0.0);

        Complex result = a.div(b);

        assertEquals(expected.getReal(), result.getReal(), 1e-10);
        assertEquals(expected.getImaginary(), result.getImaginary(), 1e-10);
    }

    @Test
    public void minus(){
        Complex a = new Complex(4, 2);
        Complex b = new Complex(2, 1);

        Complex expected = new Complex(2.0, 1.0);

        Complex result = a.minus(b);

        assertEquals(expected.getReal(), result.getReal(), 1e-10);
        assertEquals(expected.getImaginary(), result.getImaginary(), 1e-10);
    }
}
