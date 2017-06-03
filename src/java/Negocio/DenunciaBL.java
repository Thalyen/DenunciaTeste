package Negocio;

import Modelo.Denuncia;
import java.util.ArrayList;

/**
 *
 * @author Tat
 */
public class DenunciaBL {

    private final int tamanhoFrase = 255;
    private final int tamanhoTitulo = 30;
    private final ArrayList<String> tipo = new ArrayList<>();

    public DenunciaBL() {
        tipo.add("Abandono");         // Tipos válidos
        tipo.add("Maus Tratos");     // Tipos válidos
        tipo.add("Outros");               // Tipos válidos
    }

    public String validarTitulo(Denuncia d) {
        if (d.getTituloDenuncia() != null) {
            if (!d.getTituloDenuncia().isEmpty()) {
                if (d.getTituloDenuncia().length() <= tamanhoTitulo) {
                    return "ok";
                } else {
                    return "Tamanho maior que o esperado: " + d.getTituloDenuncia().length();
                }
            } else {
                return "Titulo vazio";
            }
        } else {
            return "Campo nulo";
        }
    }

    public String validarDescricao(Denuncia d) {
        if (d.getDescricaoDenuncia() != null) {
            if (!d.getDescricaoDenuncia().isEmpty()) {
                if (d.getDescricaoDenuncia().length() <= tamanhoFrase) {
                    return "ok";
                } else {
                    return "Tamanho maior que o esperado: " + d.getDescricaoDenuncia().length();
                }
            } else {
                return "Descrição vazio";
            }
        } else {
            return "Campo nulo";
        }
    }

    public String validarTipo(Denuncia d) {
         if (!d.getTipoDenuncia().isEmpty()) {
        if (tipo.contains(d.getTipoDenuncia())) {
            return "ok";
        } else {
            return "Campo inválido: " + d.getTipoDenuncia();
        }
         }else{
             return "Tipo vazio";
         }
    }

    public String validarLocalizacao(Denuncia d) {
        if (d.getDescricaoDenuncia() != null) {
            if (!d.getLocalizacao().isEmpty()) {
                if (d.getLocalizacao().length() <= tamanhoFrase) {
                    return "ok";
                } else {
                    return "Tamanho maior que o esperado: " + d.getLocalizacao().length();
                }
            } else {
                return "Localizaçâo vazio";
            }
        } else {
            return "Campo nulo";
        }
    }

    public String cadastrarDenuncia(Denuncia d) {
        if (d != null && !d.isEmpty()) {
            if (validarTitulo(d).equals("ok")) {
                if (validarTipo(d).equals("ok")) {
                    if (validarDescricao(d).equals("ok")) {
                        if (validarLocalizacao(d).equals("ok")) {
                            //dao.cadastrarDenuncia(d);
                            return "cadastrado com sucesso";
                        } else {
                            return validarLocalizacao(d);
                        }
                    } else {
                        return validarDescricao(d);
                    }
                } else {
                    return validarTipo(d);
                }
            } else {
                return validarTitulo(d);
            }
        } else if (d == null) {
            return "Objeto nulo";
        }
        return "Objeto vazio";
    }

   /* public static void main(String[] args) {
        Denuncia d = new Denuncia(0, "titulo", "frase", "foto", "Abandono", "frase");
        DenunciaBL den = new DenunciaBL();

        System.out.println(den.cadastrarDenuncia(d));
    }*/
}
