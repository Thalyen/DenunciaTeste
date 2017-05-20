/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tat
 */
public class DenunciaTest {

    Denuncia d0;
    Denuncia d1;

    public DenunciaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        d0 = new Denuncia(0, "Denuncia 0", "descricaoDenuncia", "foto.png", "abandono", " localizacao");
        d1 = new Denuncia(1, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk",
                "The Inuit and Yupik people carved Inuit snow goggles from caribou antler, wood, and shell to help prevent snow blindness. "
                + "The goggles were curved to fit the user's face and had a large groove cut in the back to allow for the nose. A long thin slit was cut through the "
                + "goggles to allow in a small amount of light, diminishing subsequent ultraviolet rays. The goggles were held to the head by a cord made of caribou sinew."
                + "In the early 20th century, goggles were worn by drivers of uncovered cars to prevent irritation of the eyes by dust or wind.[1] Likewise in the first ten years after t"
                + "he invention of the airplane in 1903 goggles became a necessity as wind blow became more severe as aircraft speeds increased and as "
                + "protection against bugstrikes at high altitudes. The first pilot to wear goggles was probably Charles Manly in his failed attempt to fly Samuel"
                + " Langley's aerodrome in 1903.",
                "foto.bit", "outra coisa",
                "The Inuit and Yupik people carved Inuit snow goggles from caribou antler, wood, and shell to help prevent snow blindness. "
                + "The goggles were curved to fit the user's face and had a large groove cut in the back to allow for the nose. A long thin slit was cut through the "
                + "goggles to allow in a small amount of light, diminishing subsequent ultraviolet rays. The goggles were held to the head by a cord made of caribou sinew."
                + "In the early 20th century, goggles were worn by drivers of uncovered cars to prevent irritation of the eyes by dust or wind.[1] Likewise in the first ten years after t"
                + "he invention of the airplane in 1903 goggles became a necessity as wind blow became more severe as aircraft speeds increased and as "
                + "protection against bugstrikes at high altitudes. The first pilot to wear goggles was probably Charles Manly in his failed attempt to fly Samuel"
                + " Langley's aerodrome in 1903.");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getIdDenuncia method, of class Denuncia.
     */
    @Test
    public void testGetIdDenuncia() {

    }

    /**
     * Test of setIdDenuncia method, of class Denuncia.
     */
    @Test
    public void testSetIdDenuncia() {

    }

    /**
     * Test of getTituloDenuncia method, of class Denuncia.
     */
    @Test
    public void testGetTituloDenuncia() {

    }

    /**
     * Test of setTituloDenuncia method, of class Denuncia.
     */
    @Test
    public void testSetTituloDenuncia() {

    }

    /**
     * Test of getDescricaoDenuncia method, of class Denuncia.
     */
    @Test
    public void testGetDescricaoDenuncia() {

    }

    /**
     * Test of setDescricaoDenuncia method, of class Denuncia.
     */
    @Test
    public void testSetDescricaoDenuncia() {

    }

    /**
     * Test of getFotoDenuncia method, of class Denuncia.
     */
    @Test
    public void testGetFotoDenuncia() {

    }

    /**
     * Test of setFotoDenuncia method, of class Denuncia.
     */
    @Test
    public void testSetFotoDenuncia() {

    }

    /**
     * Test of getTipoDenuncia method, of class Denuncia.
     */
    @Test
    public void testGetTipoDenuncia() {

    }

    /**
     * Test of setTipoDenuncia method, of class Denuncia.
     */
    @Test
    public void testSetTipoDenuncia() {

    }

    /**
     * Test of getDataDenuncia method, of class Denuncia.
     */
    @Test
    public void testGetDataDenuncia() {

    }

    /**
     * Test of setDataDenuncia method, of class Denuncia.
     */
    @Test
    public void testSetDataDenuncia() {

    }

    /**
     * Test of getLocalizacao method, of class Denuncia.
     */
    @Test
    public void testGetLocalizacao() {

    }

    /**
     * Test of setLocalizacao method, of class Denuncia.
     */
    @Test
    public void testSetLocalizacao() {

    }

    @Test
    public void testCadTamCampo() {
        assertFalse(maior(d0.getTituloDenuncia(), 30));
        assertFalse(maior(d0.getDescricaoDenuncia(), 255));
        assertFalse(maior(d0.getLocalizacao(), 255));
        assertTrue(maior(d1.getTituloDenuncia(), 30));
        assertTrue(maior(d1.getDescricaoDenuncia(), 255));
        assertTrue(maior(d1.getLocalizacao(), 255));
    }
    
    @Test
    public void testNull(){
        // Testando campos null para Título, Descrição e Localizaçao
        assertNotNull(d1.getTituloDenuncia());
        assertNotNull(d0.getTituloDenuncia());
        assertNotNull(d1.getDescricaoDenuncia());
        assertNotNull(d0.getDescricaoDenuncia());
        assertNotNull(d1.getLocalizacao());
        assertNotNull(d0.getLocalizacao());
    }

    public boolean maior(String s, int i) {
        Boolean a;
        if (s.length() > i) {
            a = true;
        } else {
            a = false;
        }
        return a;
    }

}
