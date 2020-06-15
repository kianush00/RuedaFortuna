import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuedaFortunaTest {

    RuedaFortuna o;

    @BeforeEach
    void setUp() {
        o = new RuedaFortuna();
    }

    @AfterEach
    void tearDown() {
        o = null;
    }

    @Test
    void lanzarRueda1(){
        o.inicializarRueda(20);
        System.out.println(o.lanzarRueda());
    }

    @Test
    void lanzarRueda2() {
        o.inicializarRueda(2);
        System.out.println(o.lanzarRueda());
    }

    @Test
    void lanzarRueda3() {
        o.inicializarRueda(-4);
    }
}