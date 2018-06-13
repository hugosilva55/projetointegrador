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
public class Funcionario {

    @Id
    @GeneratedValue
    private int idFuncionario;
    @Column(length = 50, nullable = false)
    private String nomeFuncionario;
    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 20, nullable = false)
    private String cpf;
    @Column(length = 25, nullable = false)
    private String loginFunc;
    @Column(length = 50, nullable = false)
    private String senhaFunc;
    @Column(length = 50, nullable = false)
    private String NivelDeAcesso;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getLoginFunc() {
        return loginFunc;
    }

    public void setLoginFunc(String loginFunc) {
        this.loginFunc = loginFunc;
    }

    public String getSenhaFunc() {
        return senhaFunc;
    }

    public void setSenhaFunc(String senhaFunc) {
        this.senhaFunc = senhaFunc;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNivelDeAcesso() {
        return NivelDeAcesso;
    }

    public void setNivelDeAcesso(String NivelDeAcesso) {
        this.NivelDeAcesso = NivelDeAcesso;
    }

}
