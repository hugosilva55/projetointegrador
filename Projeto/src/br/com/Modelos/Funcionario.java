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
public class Funcionario{

    @Id
    @GeneratedValue
    private int idUsuario;
    @Column(length = 25, nullable = false)
    private String nomeFuncionario;
    @Column(length = 25, nullable = false)
    private String email;
    @Column(length = 11, nullable = false)
    private String cpf;
    @Column(length = 25, nullable = false)
    private String loginFunc;
    @Column(length = 25, nullable = false)
    private String senhaFunc;

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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

}
