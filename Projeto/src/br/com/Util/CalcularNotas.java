package br.com.Util;

/**
 *
 * @author Eugênio
 */
public class CalcularNotas {

    public double CalcularPesoA(int bloco1, int bloco2, int bloco3, int bloco4) {
        double calc = (bloco1 * 4) + (bloco2 * 4) + (bloco3 * 6) + (bloco4 * 4);
        return calc;
    }

    public double CalcularPesoB(int bloco1, int bloco2, int bloco3, int bloco4) {
        double calc = (bloco1 * 6) + (bloco2 * 4) + (bloco3 * 2) + (bloco4 * 6);
        return calc;
    }

    public double calcNota(String curso, int bloco1, int bloco2, int bloco3, int bloco4) {

        switch (curso) {
            case "Enfermagem":
            case "Fisioterapia":
            case "Educação Física":
                return CalcularPesoA(bloco1, bloco2, bloco3, bloco4);
            case "Administração":
            case "Ciências Contábeis":
            case "Analise e Desenvolvimento de Sistemas":
            case "Psicologia":
            case "Serviço Social":
            case "Direito":
                return CalcularPesoB(bloco1, bloco2, bloco3, bloco4);
        }
        return 0;
    }
}
