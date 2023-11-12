import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInteger {

    @Test
    public void testSuma() {
        Integer num1 = new Integer(5);
        Integer num2 = new Integer(7);
        Integer resultado = num1.sumar(num2);
        Assert.assertEquals(resultado.intValue(), 12);
    }

    @Test
    public void testResta() {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(3);
        Integer resultado = num1.restar(num2);
        Assert.assertEquals(resultado.intValue(), 7);
    }

    @Test
    public void testMultiplicacion() {
        Integer num1 = new Integer(4);
        Integer num2 = new Integer(6);
        Integer resultado = num1.multiplicar(num2);
        Assert.assertEquals(resultado.intValue(), 24);
    }

    @Test
    public void testDivision() {
        Integer num1 = new Integer(16);
        Integer num2 = new Integer(4);
        Integer resultado = num1.dividir(num2);
        Assert.assertEquals(resultado.intValue(), 4);
    }
}