import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TestDivision {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest(name = "Resultado de {0} entre {1} equivale a {2}")
    @CsvSource({"10,2,5","33,3,11","45,6,7.5"})
    void calcDiv(double n1, double n2, double expresultado) {
        assertEquals(expresultado, Division.Dividir(n1, n2));
    }
}