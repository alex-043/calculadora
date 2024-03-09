import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TestMultiplicacion {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest(name = "Resultado de {0} por {1} es {2}")
    @CsvSource({"5,2,10","10,3,30","11,3,33"})
    void calcMulti(double n1, double n2, double expresultado) {
        assertEquals(expresultado, Multiplicar.Multiplicar(n1, n2));
    }
}