

// Imports
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import com.iterasys.Main;

// Classe
public class TestCalculator {
    // Atributos

    // Funções e métodos

    @Test
    public void testeSomar() {
        // AAA - Arrange - Act - Assert
        // CEV - Configuta - Executa - Valida
        
        // Configura
        // Dados de entrada
        float num1 = 10;
        float num2 = 8;

        // Resultado esperado
        float resultadoEsperado = 18;

        // Executa
        float resultadoAtual = Main.somar(num1, num2);

        // Valida

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testeSubtrair() {
        
        float resultadoAtual = Main.subtrair(10, 8);
        assertEquals(2, resultadoAtual);
    }

    @Test
    public void testeMultiplicar() {
        
        float resultadoAtual = Main.multiplicar(10, 8);
        assertEquals(80, resultadoAtual);
    }

    @Test
    public void testeDividirIf() {
        
        float resultadoAtual = Main.dividirIf(10, 2);
        assertEquals(5, resultadoAtual);
    }

    /* @Test
    public void testeDividirPorZeroIf() {
        
        float resultadoAtual = Main.dividirIf(10, 0);
        assertEquals("Divisão por zero não é permitida.", resultadoAtual);
    } */

    @Test
    public void testeDividirTry() {
        String resultadoAtual = Main.dividir(10, 2);
        assertEquals("5", resultadoAtual);
    }

    @Test
    public void testeDividirPorZeroTry() {
        String resultadoAtual = Main.dividir(10, 0);
        assertEquals("Divisão por zero não é permitida.", resultadoAtual);
    }

    //DDT - Data Driven Testing > Teste Direcionado à Dados (Popular: Teste com massa)
    @ParameterizedTest
    @CsvSource(value = {
        "15, 25, 40.0",
        "0, 12, 12.0",
        "-5, 9, 4.0",
        "-7, -8, -15",
        "0.5, 3.7, 4.2"
    }, delimiter = ',')
    public void testeSomarDDT(float num1, float num2, float resultadoEsperado) {
        float resultadoAtual = Main.somar(num1, num2);
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/somar.csv", numLinesToSkip = 1, delimiter = ',')
    public void testeSomarCSV(float num1, float num2, float resultadoEsperado) {
        float resultadoAtual = Main.somar(num1, num2);
        assertEquals(resultadoEsperado, resultadoAtual);
    }

}

