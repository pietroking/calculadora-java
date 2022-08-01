import org.junit.Assert;
import org.junit.Test;

public class Testes {
    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros(){
        //Arrange
        double valor1 = 2;
        double valor2 = 2;
        double resultadoEsperado = 4;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.soma(valor1, valor2);

        //Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveSubitrairCorretamenteQuandoOsValoresForemInteiros(){
        //Arrange
        double valor1 = 9;
        double valor2 = 4;
        double resultadoEsperado = 5;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.subtracao(valor1, valor2);

        //Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros(){
        //Arrange
        double valor1 = 4;
        double valor2 = 2;
        double resultadoEsperado = 2;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.divisao(valor1, valor2);

        //Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros(){
        //Arrange
        double valor1 = 3;
        double valor2 = 2;
        double resultadoEsperado = 6;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.multiplicacao(valor1, valor2);

        //Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes(){
        //Arrange
        double valor1 = 5;
        double valor2 = 2;
        double resultadoEsperado = 2.5;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.divisao(valor1, valor2);

        //Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveRealizarRaizQuadradaCorretamenteQuandoNumerosForemInteiros(){
        //Arrange
        double valor1 = 9;
        double resultadoEsperado = 3;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.raizQuadrada(valor1);

        //Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveRealizarExponenciacaoCorretamenteQuandoNumerosForemInteiros(){
        //Arrange
        double valor1 = 4;
        double valor2 = 2;
        double resultadoEsperado = 16;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.exponenciacao(valor1, valor2);

        //Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveRealizarBhaskaraCorretamenteQuandoNumerosForemInteiros(){
        //Arrange
        double valor1 = 2;
        double valor2 = 4;
        double valor3 = 2;
        double resultadoEsperado = -2;
        Calculadora calculadora = new Calculadora();

        //Act
        double valorCalculado = calculadora.bhaskara(valor1, valor2, valor3);

        //Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }
}
