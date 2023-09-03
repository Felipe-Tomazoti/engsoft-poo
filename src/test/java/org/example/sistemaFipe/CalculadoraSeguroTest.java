package org.example.sistemaFipe;
import org.example.sistemaFipe.CalculadoraSeguroTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sistemaFipe.*;

public class CalculadoraSeguroTest {

    @Test
    public void deveCalcularSolterioSemEstacionamento(){

        Automovel automovel = new Automovel(45000.0, Tipo.PASSEIO);
        Motorista manuel = new Motorista("Manuel", Estado_Civil.SOLTEIRO, automovel, null);

        CalculadoraSeguro calculadora = new CalculadoraSeguro();
        double resultado = calculadora.calcular(manuel);

        Assertions.assertEquals(9000, resultado);

    }
}
