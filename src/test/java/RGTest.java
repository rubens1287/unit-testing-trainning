import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RGTest {

    /*
        O sistema terá como entrada um documento de RG, porem o mesmo só será aceito se passar pelos criterios de aceite
        1. O RG não pode ser nulo
        2. O RG não pode ser vazio
        3. O RG deve conter o traço para separar os digitos
        4. Validar RG válido
     */

    private RG validarg;

    @Before
    public void setUp(){
        validarg = new RG();
    }

    @Test
    public void testIsValidoRG(){

        Assert.assertFalse("retorna False - invalido RG", validarg.isValidaRG("123456789"));
        Assert.assertFalse("retorna False - invalido RG", validarg.isValidaRG(null));
        Assert.assertFalse("retorna False - invalido RG", validarg.isValidaRG(""));
        Assert.assertTrue("retorna True - valido RG", validarg.isValidaRG("12345678-90"));
    }
}
