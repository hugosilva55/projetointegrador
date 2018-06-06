package br.com.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Eugênio
 */
@Entity
public class ResultadoFinal {

    @Id
    @GeneratedValue
    private int idResultadoFinal;
    @Column(length = 50, nullable = false)
    private String nomeParticipante;
    @Column(length = 10, nullable = false)
    private double notaFinal;
    //@Column(length = 50, nullable = false)
    private String classificacao;

    public int getIdResultadoFinal() {
        return idResultadoFinal;
    }

    public void setIdResultadoFinal(int idResultadoFinal) {
        this.idResultadoFinal = idResultadoFinal;
    }

    public String getNomeParticipante() {
        return nomeParticipante;
    }

    public void setNomeParticipante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
