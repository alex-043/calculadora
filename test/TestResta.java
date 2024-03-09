import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TestResta {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest(name = "Resultado de {0} menos {1} es {2}")
    @CsvSource({"5,2,3","10,9,1","33,11,22"})
    void calcResta(double n1, double n2, double expresultado) {
        assertEquals(expresultado, Resta.Resta(n1, n2));
    }
}