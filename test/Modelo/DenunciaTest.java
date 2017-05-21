/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import org.eclipse.jdt.internal.compiler.batch.Main;
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

    Denuncia d, d0, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
    ArrayList<String> tipo = new ArrayList<>();
    String frase, fraseMaior, titulo, tituloMaior, tipoErrado, foto;

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
        titulo = "titulo";
        tituloMaior = "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
        tipo.add("Abandono");
        tipo.add("Maus Tratos");
        tipoErrado = "tipoErrado";
        foto = "foto.png";
        frase = "frase";
        fraseMaior = "The Inuit and Yupik people carved Inuit snow goggles from caribou antler, wood, and shell to help prevent snow blindness. "
                + "The goggles were curved to fit the user's face and had a large groove cut in the back to allow for the nose. A long thin slit was cut through the "
                + "goggles to allow in a small amount of light, diminishing subsequent ultraviolet rays. The goggles were held to the head by a cord made of caribou sinew."
                + "In the early 20th century, goggles were worn by drivers of uncovered cars to prevent irritation of the eyes by dust or wind.[1] Likewise in the first ten years after t"
                + "he invention of the airplane in 1903 goggles became a necessity as wind blow became more severe as aircraft speeds increased and as "
                + "protection against bugstrikes at high altitudes. The first pilot to wear goggles was probably Charles Manly in his failed attempt to fly Samuel"
                + " Langley's aerodrome in 1903.";

        d0 = new Denuncia(0, titulo, frase, foto, tipo.get(0), frase);
        d = new Denuncia(1, null, frase, foto, tipo.get(0), frase);
         d2 = new Denuncia(2, tituloMaior, frase, foto, tipo.get(0), frase);
    }

    @After
    public void tearDown() {
    }

    /**
     * Teste de validação do titulo, da classe Denuncia.
     */
    @Test
    public void testTituloDenuncia() {
        System.out.println("TITULO");
        if( d.getTituloDenuncia() != null) {
            System.out.println("Titulo não é nulo");
            if(!maior(d.getTituloDenuncia(), 30)){
            System.out.println("Tamanho dentro do esperado: " + d.getTituloDenuncia().length() + "\n");    
            }else{
               System.out.println("Tamanho maior que o esperado: " + d.getTituloDenuncia().length() + "\n");    
            }
        }else
              System.out.println("Campo nulo");    
    }

    /**
     * Teste de validação da descrção, da classe Denuncia.
     */
    @Test
    public void testDescricaoDenuncia() {
        System.out.println("DESCRIÇÃO");
         if( d.getDescricaoDenuncia()!= null) {
            System.out.println("Descrição não é nulo");
            if(!maior(d.getDescricaoDenuncia(), 255)){
            System.out.println("Tamanho dentro do esperado: "+ d.getDescricaoDenuncia().length() + "\n");    
            }else{
               System.out.println("Tamanho maior que o esperado: " + d.getDescricaoDenuncia().length() + "\n");    
            }
        }else
              System.out.println("Campo nulo");
    }

    /**
     * Teste de validação do tipo, da classe Denuncia.
     */
    @Test
    public void testTipoDenuncia() {
        if( tipo.contains( d.getTipoDenuncia()))
            System.out.println("Campo válido");
        else
            System.out.println("Campo válido" + d.getTipoDenuncia()); 
    }

    /**
     * Teste de validação do localizacao, da classe Denuncia.
     */
    @Test
    public void testLocalizacaoDenuncia() {
          System.out.println("LOCALIZAÇÃO");
         if( d.getDescricaoDenuncia()!= null) {
            System.out.println("Descrição não é nulo");
            if(!maior(d.getLocalizacao(), 255)){
            System.out.println("Tamanho dentro do esperado: "+ d.getLocalizacao().length() + "\n");    
            }else{
               System.out.println("Tamanho maior que o esperado: " + d.getLocalizacao().length() + "\n");    
            }
        }else
              System.out.println("Campo nulo");
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
