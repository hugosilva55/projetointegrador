package br.com.Modelos;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OrderBy;

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
    @Column(length = 100, nullable = false)
    private double notaFinal;
    @Column(length = 50, nullable = false)
    private String classificacao;
    @Column
    private String ano;
    @Column
    private String curso;

 
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

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
