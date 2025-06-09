import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ParOuImparTest {

    @Test
    public void testNumeroPar (){
        assertEquals ("Par", ParOuImpar.verificarParOuImpar(10));

    }

    @Test
    public void testNumeroImpar (){
        assertEquals ("Impar", ParOuImpar.verificarParOuImpar(7));

    }

    @Test
    public void testZero (){
        assertEquals ("Par", ParOuImpar.verificarParOuImpar(0));
    }

    @Test
    public void testNumeroNegativoPar (){
        assertEquals ("Par", ParOuImpar.verificarParOuImpar(-4));
    }

    @Test
    public void testNumeroNegativoImpar (){
        assertEquals ("Impar", ParOuImpar.verificarParOuImpar(-3));

    }

}
