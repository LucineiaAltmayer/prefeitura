/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.time.LocalDate;
/**
 *
 * @author Administrador
 */
public class Prefeitura {
    private String endereco;
    private String nome;
    private Integer nr_funcionario;
    private Integer codigo;
    private LocalDate data_inauguracao; 

    public LocalDate getData_inauguracao() {
        return data_inauguracao;
    }

    public void setData_inauguracao(LocalDate data_inauguracao) {
        this.data_inauguracao = data_inauguracao;
    }

    @Override
    public String toString() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNr_funcionario() {
        return nr_funcionario;
    }

    public void setNr_funcionario(Integer nr_funcionario) {
        this.nr_funcionario = nr_funcionario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
