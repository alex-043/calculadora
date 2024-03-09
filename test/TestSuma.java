import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TestSuma {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @ParameterizedTest(name = "Resultado de {0} mas {1} es {2}")
    @CsvSource({"1,2,3","2,5,7","5,5,10"})
    void calcSuma(double n1, double n2, double expresultado) {
        assertEquals(expresultado, Suma.Suma(n1, n2));

    }
}