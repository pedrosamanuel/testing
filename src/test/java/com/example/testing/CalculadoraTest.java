package com.example.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calc = new Calculadora();
    @Test
    void testCalc(){
        assertEquals(240,calc.multiplicar(80,3));
        assertEquals(110,calc.dividir(calc.sumar(150,180),3));
        assertNotEquals(605,calc.multiplicar(calc.restar(90,50),15));
        assertNotEquals(2700,calc.multiplicar(calc.sumar(40,70),25 ));
    }


}