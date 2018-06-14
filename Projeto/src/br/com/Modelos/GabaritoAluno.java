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
public class GabaritoAluno {
    @Id
    @GeneratedValue  
    private int idGabarito;
    @Column(length = 50, nullable = true)
    private String curso;
    @Column(length = 50, nullable = true)
    private String ProcessoSeletivo;
    @Column(length = 1, nullable = true)
    private String Resposta1;
    @Column(length = 1, nullable = true)
    private String Resposta2;
    @Column(length = 1, nullable = true)
    private String Resposta3;
    @Column(length = 1, nullable = true)
    private String Resposta4;
    @Column(length = 1, nullable = true)
    private String Resposta5;
    @Column(length = 1, nullable = true)
    private String Resposta6;
    @Column(length = 1, nullable = true)
    private String Resposta7;
    @Column(length = 1, nullable = true)
    private String Resposta8;
    @Column(length = 1, nullable = true)
    private String Resposta9;
    @Column(length = 1, nullable = true)
    private String Resposta10;
    @Column(length = 1, nullable = true)
    private String Resposta11;
    @Column(length = 1, nullable = true)
    private String Resposta12;
    @Column(length = 1, nullable = true)
    private String Resposta13;
    @Column(length = 1, nullable = true)
    private String Resposta14;
    @Column(length = 1, nullable = true)
    private String Resposta15;
    @Column(length = 1, nullable = true)
    private String Resposta16;
    @Column(length = 1, nullable = true)
    private String Resposta17;
    @Column(length = 1, nullable = true)
    private String Resposta18;
    @Column(length = 1, nullable = true)
    private String Resposta19;
    @Column(length = 1, nullable = true)
    private String Resposta20;
    @Column(length = 1, nullable = true)
    private String redacao;
    

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

    /**
     * @return the Resposta11
     */
    public String getResposta11() {
        return Resposta11;
    }

    /**
     * @param Resposta11 the Resposta11 to set
     */
    public void setResposta11(String Resposta11) {
        this.Resposta11 = Resposta11;
    }

    /**
     * @return the Resposta12
     */
    public String getResposta12() {
        return Resposta12;
    }

    /**
     * @param Resposta12 the Resposta12 to set
     */
    public void setResposta12(String Resposta12) {
        this.Resposta12 = Resposta12;
    }

    /**
     * @return the Resposta13
     */
    public String getResposta13() {
        return Resposta13;
    }

    /**
     * @param Resposta13 the Resposta13 to set
     */
    public void setResposta13(String Resposta13) {
        this.Resposta13 = Resposta13;
    }

    /**
     * @return the Resposta14
     */
    public String getResposta14() {
        return Resposta14;
    }

    /**
     * @param Resposta14 the Resposta14 to set
     */
    public void setResposta14(String Resposta14) {
        this.Resposta14 = Resposta14;
    }

    /**
     * @return the Resposta15
     */
    public String getResposta15() {
        return Resposta15;
    }

    /**
     * @param Resposta15 the Resposta15 to set
     */
    public void setResposta15(String Resposta15) {
        this.Resposta15 = Resposta15;
    }

    /**
     * @return the Resposta16
     */
    public String getResposta16() {
        return Resposta16;
    }

    /**
     * @param Resposta16 the Resposta16 to set
     */
    public void setResposta16(String Resposta16) {
        this.Resposta16 = Resposta16;
    }

    /**
     * @return the Resposta17
     */
    public String getResposta17() {
        return Resposta17;
    }

    /**
     * @param Resposta17 the Resposta17 to set
     */
    public void setResposta17(String Resposta17) {
        this.Resposta17 = Resposta17;
    }

    /**
     * @return the Resposta18
     */
    public String getResposta18() {
        return Resposta18;
    }

    /**
     * @param Resposta18 the Resposta18 to set
     */
    public void setResposta18(String Resposta18) {
        this.Resposta18 = Resposta18;
    }

    /**
     * @return the Resposta19
     */
    public String getResposta19() {
        return Resposta19;
    }

    /**
     * @param Resposta19 the Resposta19 to set
     */
    public void setResposta19(String Resposta19) {
        this.Resposta19 = Resposta19;
    }

    /**
     * @return the Resposta20
     */
    public String getResposta20() {
        return Resposta20;
    }

    /**
     * @param Resposta20 the Resposta20 to set
     */
    public void setResposta20(String Resposta20) {
        this.Resposta20 = Resposta20;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @param redacao the redacao to set
     */
    public void setRedacao(String redacao) {
        this.redacao = redacao;
    }

    /**
     * @return the redacao
     */
    public String getRedacao() {
        return redacao;
    }

}
