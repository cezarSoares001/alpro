package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.ArvoreEnraizada;
import classes.ArvoreTernaria;
import classes.Contagem.*;

public class ArvoreEnraizadaTeste {

//    // F2
//    @Test
//    public void verificaASuperposicaoDeUmaArvoreCanhotaEDeUmaArvoreDestraComSobreposicaoIgualV1() {
//
//        // Arrange
//        ArvoreEnraizada arvoreEnraizada = new ArvoreEnraizada();
//
//        ArvoreTernaria canhota = new ArvoreTernaria('C', 5);
//        canhota.addNodo(1, 2, 3);
//        canhota.addNodo(2, 4, 5);
//        canhota.addNodo(3, 0, 0);
//        canhota.addNodo(4, 0, 0);
//        canhota.addNodo(5, 0, 0);
//
//        ArvoreTernaria destra = new ArvoreTernaria('D', 3);
//        destra.addNodo(1, 2, 3);
//        destra.addNodo(2, 0, 0);
//        destra.addNodo(3, 0, 0);
//
//        int esperado = 6;
//
//        // Act
//        int atual = arvoreEnraizada.superposicaoDeArvores(canhota, destra);
//        System.out.println(canhota.toString() + destra.toString());
//        // Assert
//        assertEquals(esperado, atual);
//
//    }
//
//    // F10
//    @Test
//    public void verificaASuperposicaoDeUmaArvoreCanhotaEDeUmaArvoreDestraComSobreposicaoCentralIgualV2() {
//
//        // Arrange
//        ArvoreEnraizada arvoreEnraizada = new ArvoreEnraizada();
//
//        ArvoreTernaria canhota = new ArvoreTernaria('C', 5);
//        canhota.addNodo(1, 0, 2);
//        canhota.addNodo(2, 3, 0);
//        canhota.addNodo(3, 0, 4);
//        canhota.addNodo(4, 0, 5);
//        canhota.addNodo(5, 0, 0);
//
//        ArvoreTernaria destra = new ArvoreTernaria('D', 5);
//        destra.addNodo(1, 2, 0);
//        destra.addNodo(2, 0, 3);
//        destra.addNodo(3, 4, 0);
//        destra.addNodo(4, 5, 0);
//        destra.addNodo(5, 0, 0);
//
//        int esperado = 8;
//
//        // Act
//        int atual = arvoreEnraizada.superposicaoDeArvores(canhota, destra);
//        
//        System.out.println(canhota.toString() + destra.toString());
//        // Assert
//        assertEquals(esperado, atual);
//
//    }
//
//    // F3
//    @Test
//    public void verificaASuperposicaoDeUmaArvoreCanhotaEDeUmaArvoreDestraComSobreposicaoCentralDiferenteV1() {
//
//        // Arrange
//        ArvoreEnraizada arvoreEnraizada = new ArvoreEnraizada();
//
//        ArvoreTernaria canhota = new ArvoreTernaria('C', 3);
//        canhota.addNodo(3, 0, 2);
//        canhota.addNodo(2, 0, 0);
//        canhota.addNodo(1, 0, 3);
//
//        ArvoreTernaria destra = new ArvoreTernaria('D', 2);
//        destra.addNodo(2, 0, 0);
//        destra.addNodo(1, 2, 0);
//
//        int esperado = 3;
//
//        // Act
//        int atual = arvoreEnraizada.superposicaoDeArvores(canhota, destra);
//        System.out.println(canhota.toString() + destra.toString());
//        // Assert
//        assertEquals(esperado, atual);
//    }
//
//    @Test
//    public void verificaASuperposicaoDeUmaArvoreCanhotaEDeUmaArvoreDestraComSobreposicaoCentralDiferenteV2() {
//
//        // Arrange
//        ArvoreEnraizada arvoreEnraizada = new ArvoreEnraizada();
//
//        ArvoreTernaria canhota = new ArvoreTernaria('C', 2);
//        canhota.addNodo(2, 0, 0);
//        canhota.addNodo(1, 2, 0);
//
//        ArvoreTernaria destra = new ArvoreTernaria('D', 3);
//        destra.addNodo(3, 0, 2);
//        destra.addNodo(2, 0, 0);
//        destra.addNodo(1, 0, 3);
//
//        int esperado = 4;
//
//        // Act
//        int atual = arvoreEnraizada.superposicaoDeArvores(canhota, destra);
//        System.out.println(canhota.toString() + destra.toString());
//        // Assert
//        assertEquals(esperado, atual);
//    }

    @Test
    public void testeF1() {

        // Arrange
        ArvoreEnraizada arvoreEnraizada = new ArvoreEnraizada();

        ArvoreTernaria canhota = new ArvoreTernaria('C', 7);
        canhota.addNodo(1, 2, 3);
        canhota.addNodo(2, 0, 0);
        canhota.addNodo(3, 4, 0);
        canhota.addNodo(4, 0, 5);
        canhota.addNodo(5, 0, 6);
        canhota.addNodo(6, 7, 0);
        canhota.addNodo(7, 0, 0);

        ArvoreTernaria destra = new ArvoreTernaria('D', 7);
        destra.addNodo(1, 2, 3);
        destra.addNodo(2, 4, 0);
        destra.addNodo(3, 5, 0);
        destra.addNodo(4, 0, 6);
        destra.addNodo(5, 0, 0);
        destra.addNodo(6, 0, 7);
        destra.addNodo(7, 0, 0);

        int esperado = 11;

        // Act
        int atual = arvoreEnraizada.superposicaoDeArvores(canhota, destra);
        System.out.println(canhota.toString() + destra.toString());
        // Assert
        assertEquals(esperado, atual);
    }

    @Test
    public void testeF2() {

        // Arrange
        ArvoreEnraizada arvoreEnraizada = new ArvoreEnraizada();

        ArvoreTernaria canhota = new ArvoreTernaria('C', 5);
        canhota.addNodo(1, 2, 3);
        canhota.addNodo(2, 4, 5);
        canhota.addNodo(3, 0, 0);
        canhota.addNodo(4, 0, 0);
        canhota.addNodo(5, 0, 0);

        ArvoreTernaria destra = new ArvoreTernaria('D', 3);
        destra.addNodo(1, 2, 3);
        destra.addNodo(2, 0, 0);
        destra.addNodo(3, 0, 0);

        int esperado = 6;

        // Act
        int atual = arvoreEnraizada.superposicaoDeArvores(canhota, destra);
        System.out.println(canhota.toString() + destra.toString());
        // Assert
        assertEquals(esperado, atual);
    }

    @Test
    public void testeF3() {

        // Arrange
        ArvoreEnraizada arvoreEnraizada = new ArvoreEnraizada();

        ArvoreTernaria canhota = new ArvoreTernaria('C', 3);
        canhota.addNodo(3, 0, 2);
        canhota.addNodo(2, 0, 0);
        canhota.addNodo(1, 0, 3);

        ArvoreTernaria destra = new ArvoreTernaria('D', 2);
        destra.addNodo(2, 0, 0);
        destra.addNodo(1, 2, 0);

        int esperado = 3;

        // Act
        int atual = arvoreEnraizada.superposicaoDeArvores(canhota, destra);
        System.out.println(canhota.toString() + destra.toString());
        // Assert
        assertEquals(esperado, atual);
    }

    @Test
    public void testeF4() {

        // Arrange
        ArvoreEnraizada arvoreEnraizada = new ArvoreEnraizada();

        ArvoreTernaria canhota = new ArvoreTernaria('C', 1);
        canhota.addNodo(1, 0, 0);

        ArvoreTernaria destra = new ArvoreTernaria('D', 1);
        destra.addNodo(1, 0, 0);

        int esperado = 1;

        // Act
        int atual = arvoreEnraizada.superposicaoDeArvores(canhota, destra);
        System.out.println(canhota.toString() + destra.toString());
        // Assert
        assertEquals(esperado, atual);
    }

    @Test
    public void testeF5() {

        // Arrange
        ArvoreEnraizada arvoreEnraizada = new ArvoreEnraizada();

        ArvoreTernaria canhota = new ArvoreTernaria('C', 2);
        canhota.addNodo(1, 2, 0);
        canhota.addNodo(2, 0, 0);

        ArvoreTernaria destra = new ArvoreTernaria('D', 1);
        destra.addNodo(1, 0, 0);

        int esperado = 2;

        // Act
        int atual = arvoreEnraizada.superposicaoDeArvores(canhota, destra);
        System.out.println(canhota.toString() + destra.toString());
        // Assert
        assertEquals(esperado, atual);
    }

    @Test
    public void testeF10() {

        // Arrange
        ArvoreEnraizada arvoreEnraizada = new ArvoreEnraizada();

        ArvoreTernaria canhota = new ArvoreTernaria('C', 5);
        canhota.addNodo(1, 0, 2);
        canhota.addNodo(2, 3, 0);
        canhota.addNodo(3, 0, 4);
        canhota.addNodo(4, 0, 5);
        canhota.addNodo(5, 0, 0);

        ArvoreTernaria destra = new ArvoreTernaria('D', 5);
        destra.addNodo(1, 2, 0);
        destra.addNodo(2, 0, 3);
        destra.addNodo(3, 4, 0);
        destra.addNodo(4, 5, 0);
        destra.addNodo(5, 0, 0);

        int esperado = 8;

        // Act
        int atual = arvoreEnraizada.superposicaoDeArvores(canhota, destra);
        System.out.println(canhota.toString() + destra.toString());
        // Assert
        assertEquals(esperado, atual);

    }

    @Test
    public void testeF12() {

        // Arrange
        ArvoreEnraizada arvoreEnraizada = new ArvoreEnraizada();

        ArvoreTernaria canhota = new ArvoreTernaria('C', 5);
        canhota.addNodo(1, 3, 2);
        canhota.addNodo(2, 5, 0);
        canhota.addNodo(3, 4, 0);
        canhota.addNodo(4, 0, 0);
        canhota.addNodo(5, 0, 0);

        ArvoreTernaria destra = new ArvoreTernaria('D', 5);
        destra.addNodo(1, 0, 2);
        destra.addNodo(2, 3, 0);
        destra.addNodo(3, 0, 4);
        destra.addNodo(4, 5, 0);
        destra.addNodo(5, 0, 0);

        int esperado = 8;

        // Act
        int atual = arvoreEnraizada.superposicaoDeArvores(canhota, destra);
        System.out.println(canhota.toString() + destra.toString());
        // Assert
        assertEquals(esperado, atual);
    }
    @Test
    public void testeF15() {

        // Arrange
        ArvoreEnraizada arvoreEnraizada = new ArvoreEnraizada();

        ArvoreTernaria canhota = new ArvoreTernaria('C', 10);
        canhota.addNodo(1, 3, 2);
        canhota.addNodo(2, 5, 0);
        canhota.addNodo(3, 4, 0);
        canhota.addNodo(4, 0, 0);
        canhota.addNodo(5, 6, 0);
        canhota.addNodo(6, 0, 0);
        canhota.addNodo(7, 0, 0);
        canhota.addNodo(8, 0, 0);
        canhota.addNodo(9, 0, 0);
        canhota.addNodo(10, 0, 0);

        ArvoreTernaria destra = new ArvoreTernaria('D', 10);
        destra.addNodo(1, 0, 2);
        destra.addNodo(2, 3, 0);
        destra.addNodo(3, 0, 4);
        destra.addNodo(4, 5, 0);
        destra.addNodo(5, 0, 0);
        destra.addNodo(6, 0, 0);
        destra.addNodo(7, 0, 0);
        destra.addNodo(8, 0,0);
        destra.addNodo(9, 0,0);
        destra.addNodo(10, 0, 0);

        int esperado = 18;

        // Act
        int atual = arvoreEnraizada.superposicaoDeArvores(canhota, destra);
        System.out.println(canhota.toString() + destra.toString());
        // Assert
        assertEquals(esperado, atual);
    }

}
