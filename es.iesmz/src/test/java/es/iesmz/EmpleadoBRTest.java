package es.iesmz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoBRTest {

    @BeforeEach
    void iniciaTest() {
        System.out.println("EXECUTE PROVA");
    }

    @Test
    public void testCalculaSalarioBruto1() {

        float resultadoReal = EmpleadoBR.calculaSalarioBruto(EmpleadoBR.TipoEmpleado.venedor,
                2000.0f, 8);

        float resultadoEsperado = 1360.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);

    }

    @Test
    public void testCalculaSalarioBruto2() {

        float resultadoReal = EmpleadoBR.calculaSalarioBruto(EmpleadoBR.TipoEmpleado.venedor,
                1500.0f, 3);

        float resultadoEsperado = 1260.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);

    }

    @Test
    public void testCalculaSalarioBruto3() {

        float resultadoReal = EmpleadoBR.calculaSalarioBruto(EmpleadoBR.TipoEmpleado.venedor,
                1499.99f, 0);

        float resultadoEsperado = 1100.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);

    }

    @Test
    public void testCalculaSalarioBruto4() {

        float resultadoReal = EmpleadoBR.calculaSalarioBruto(EmpleadoBR.TipoEmpleado.encarregat,
                1250.0f, 8);

        float resultadoEsperado = 1760.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);

    }

    @Test
    public void testCalculaSalarioBruto5() {

        float resultadoReal = EmpleadoBR.calculaSalarioBruto(EmpleadoBR.TipoEmpleado.encarregat,
                1000.0f, 0);

        float resultadoEsperado = 1600.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);

    }

    @Test
    public void testCalculaSalarioBruto6() {

        float resultadoReal = EmpleadoBR.calculaSalarioBruto(EmpleadoBR.TipoEmpleado.encarregat,
                999.99f, 3);

        float resultadoEsperado = 1560.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);

    }

    @Test
    public void testCalculaSalarioBruto7() {

        float resultadoReal = EmpleadoBR.calculaSalarioBruto(EmpleadoBR.TipoEmpleado.encarregat,
                500.0f, 0);

        float resultadoEsperado = 1500.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);

    }

    @Test
    public void testCalculaSalarioBruto8() {

        float resultadoReal = EmpleadoBR.calculaSalarioBruto(EmpleadoBR.TipoEmpleado.venedor,
                -1, 8);

        float resultadoEsperado = -1;

        assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testCalculaSalarioBruto9() {

        float resultadoReal = EmpleadoBR.calculaSalarioBruto(EmpleadoBR.TipoEmpleado.venedor,
                1500, -1);

        float resultadoEsperado = -1;

        assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testCalculaSalarioBruto10() {

        float resultadoReal = EmpleadoBR.calculaSalarioBruto(null,
                1500, 8);

        float resultadoEsperado = -1;

        assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testCalculaSalarioNeto1() {

        float resultadoReal = EmpleadoBR.calculaSalarioNeto(2000);

        float resultadoEsperado = 1640;

        assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testCalculaSalarioNeto2() {

        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1500);

        float resultadoEsperado = 1230;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testCalculaSalarioNeto3() {

        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1499.99f);

        float resultadoEsperado = 1259.9916f;

        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalculaSalarioNeto4() {

        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1250);

        float resultadoEsperado = 1050;

        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalculaSalarioNeto5() {

        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1000);

        float resultadoEsperado = 840;

        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalculaSalarioNeto6() {

        float resultadoReal = EmpleadoBR.calculaSalarioNeto(999.99f);

        float resultadoEsperado = 999.99f;

        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalculaSalarioNeto7() {

        float resultadoReal = EmpleadoBR.calculaSalarioNeto(500);

        float resultadoEsperado = 500;

        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalculaSalarioNeto8() {

        float resultadoReal = EmpleadoBR.calculaSalarioNeto(0);

        float resultadoEsperado = 0;

        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalculaSalarioNeto9() {

        float resultadoReal = EmpleadoBR.calculaSalarioNeto(-1);

        float resultadoEsperado = -1;

        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }


}