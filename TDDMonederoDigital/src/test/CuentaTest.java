package test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class CuentaTest {


    @Test
    public void testtestAlCrearCuentaElSaldoEsCero(){
        Cuenta c = new Cuenta();
        Assertions.assertEquals(0,c.getSaldo());
    }

    @Test
    public void testAlIngresar100EnCuentaVaciaElSaldoEs100(){
        Cuenta c = new Cuenta();
        c.ingresar(100);
        Assertions.assertEquals(100,c.getSaldo());
    }

    @Test
    public void testAlIngresar3000EnCuentaVaciaElSaldoEs3000(){
        Cuenta c = new Cuenta();
        c.ingresar(3000);
        Assertions.assertEquals(3000,c.getSaldo());
    }

    @Test
    public void testAlIngresar100EnCuentaCon3000ElSaldoEs3100(){
        Cuenta c = new Cuenta();
        c.ingresar(100);
        c.ingresar(3000);
        Assertions.assertEquals(3100,c.getSaldo());
    }

    @Test
    public void testNoSePuedeIngresarCAntidadNegativa() {
        Cuenta c = new Cuenta();
        c.ingresar(-100);
        Assertions.assertEquals(0,c.getSaldo());
    }

    @Test
    public void IngresoCantidad2Decimales(){
        Cuenta c = new Cuenta();
        c.ingresar(100.45);
        Assertions.assertEquals(100.45,c.getSaldo());
    }

    @Test
    public void testIngresoMaximoEsDe6000(){
        Cuenta c = new Cuenta();
        c.ingresar(6000);
        Assertions.assertEquals(6000,c.getSaldo());
    }

    @Test
    public void testIngresoMasDe6000NoEsValido(){
        Cuenta c = new Cuenta();
        c.ingresar(6000.01);
        Assertions.assertEquals(0,c.getSaldo());
    }
}