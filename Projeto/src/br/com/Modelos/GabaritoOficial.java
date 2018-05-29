package br.com.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author vinni
 */
@Entity
public class GabaritoOficial {
    @Id
    @GeneratedValue  
    private int idGabarito;
    @Column(length = 50, nullable = false)
    private String ProcessoSeletivo;
    @Column(length = 50, nullable = false)
    private String Resposta1;
    @Column(length = 1, nullable = false)
    private String Resposta2;
    @Column(length = 1, nullable = false)
    private String Resposta3;
    @Column(length = 1, nullable = false)
    private String Resposta4;
    @Column(length = 1, nullable = false)
    private String Resposta5;
    @Column(length = 1, nullable = false)
    private String Resposta6;
    @Column(length = 1, nullable = false)
    private String Resposta7;
    @Column(length = 1, nullable = false)
    private String Resposta8;
    @Column(length = 1, nullable = false)
    private String Resposta9;
    @Column(length = 1, nullable = false)
    private String Resposta10;

    /**
     * @return the idGabarito
     */
    public int getIdGabarito() {
        return idGabarito;
    }

    /**
     * @param idGabarito the idGabarito to set
     */
    public void setIdGabarito(int idGabarito) {
        this.idGabarito = idGabarito;
    }

    /**
     * @return the ProcessoSeletivo
     */
    public String getProcessoSeletivo() {
        return ProcessoSeletivo;
    }

    /**
     * @param ProcessoSeletivo the ProcessoSeletivo to set
     */
    public void setProcessoSeletivo(String ProcessoSeletivo) {
        this.ProcessoSeletivo = ProcessoSeletivo;
    }

    /**
     * @return the Resposta1
     */
    public String getResposta1() {
        return Resposta1;
    }

    /**
     * @param Resposta1 the Resposta1 to set
     */
    public void setResposta1(String Resposta1) {
        this.Resposta1 = Resposta1;
    }

    /**
     * @return the Resposta2
     */
    public String getResposta2() {
        return Resposta2;
    }

    /**
     * @param Resposta2 the Resposta2 to set
     */
    public void setResposta2(String Resposta2) {
        this.Resposta2 = Resposta2;
    }

    /**
     * @return the Resposta3
     */
    public String getResposta3() {
        return Resposta3;
    }

    /**
     * @param Resposta3 the Resposta3 to set
     */
    public void setResposta3(String Resposta3) {
        this.Resposta3 = Resposta3;
    }

    /**
     * @return the Resposta4
     */
    public String getResposta4() {
        return Resposta4;
    }

    /**
     * @param Resposta4 the Resposta4 to set
     */
    public void setResposta4(String Resposta4) {
        this.Resposta4 = Resposta4;
    }

    /**
     * @return the Resposta5
     */
    public String getResposta5() {
        return Resposta5;
    }

    /**
     * @param Resposta5 the Resposta5 to set
     */
    public void setResposta5(String Resposta5) {
        this.Resposta5 = Resposta5;
    }

    /**
     * @return the Resposta6
     */
    public String getResposta6() {
        return Resposta6;
    }

    /**
     * @param Resposta6 the Resposta6 to set
     */
    public void setResposta6(String Resposta6) {
        this.Resposta6 = Resposta6;
    }

    /**
     * @return the Resposta7
     */
    public String getResposta7() {
        return Resposta7;
    }

    /**
     * @param Resposta7 the Resposta7 to set
     */
    public void setResposta7(String Resposta7) {
        this.Resposta7 = Resposta7;
    }

    /**
     * @return the Resposta8
     */
    public String getResposta8() {
        return Resposta8;
    }

    /**
     * @param Resposta8 the Resposta8 to set
     */
    public void setResposta8(String Resposta8) {
        this.Resposta8 = Resposta8;
    }

    /**
     * @return the Resposta9
     */
    public String getResposta9() {
        return Resposta9;
    }

    /**
     * @param Resposta9 the Resposta9 to set
     */
    public void setResposta9(String Resposta9) {
        this.Resposta9 = Resposta9;
    }

    /**
     * @return the Resposta10
     */
    public String getResposta10() {
        return Resposta10;
    }

    /**
     * @param Resposta10 the Resposta10 to set
     */
    public void setResposta10(String Resposta10) {
        this.Resposta10 = Resposta10;
    }

}
