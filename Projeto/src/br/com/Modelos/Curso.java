package br.com.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Thiago Alencar
 */
@Entity
public class Curso {
    @Id
    @GeneratedValue  
    private int idCurso;
    @Column(length = 50, nullable = false)
    private String curso;
    @Column(length = 50, nullable = false)
    private String cargaHoraria;
    @Column(length = 50, nullable = false)
    private String turno;
    @Column(length = 50, nullable = false)
    private String quantVagas;
    @Column(length = 50, nullable = false)
    private String coordenador;

    /**
     * @return the idCurso
     */
    public int getIdCurso() {
        return idCurso;
    }

    /**
     * @param idCurso the idCurso to set
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
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

    /**
     * @return the cargaHoraria
     */
    public String getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * @return the quantVagas
     */
    public String getQuantVagas() {
        return quantVagas;
    }

    /**
     * @param quantVagas the quantVagas to set
     */
    public void setQuantVagas(String quantVagas) {
        this.quantVagas = quantVagas;
    }

    /**
     * @return the coordenador
     */
    public String getCoordenador() {
        return coordenador;
    }

    /**
     * @param coordenador the coordenador to set
     */
    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
    
    

}
