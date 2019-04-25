package model.domain;

import java.util.Date;

/**
 *
 * @author Emerson Gabriel
 */
public class ClienteImportacao implements Lote {

    private char tipo;
    private String cpf;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private Date dataHoraCadastro;
    private String tipolote;

    public String getTipolote() {
        return tipolote;
    }

    public void setTipolote(String tipolote) {
        this.tipolote = tipolote;
    }
    private String numeroLote;

    public ClienteImportacao() {

    }

    @Override
    public String getTipoLote() {
        return "Cliente";
    }

    public void setTipoLote(String lt) {
        this.tipolote = lt;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(Date dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public void setNumeroLote(String lote) {
        this.numeroLote = lote;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    @Override
    public String toString() {
        return "ClienteImportacao\nTipo: " + tipo + "\nCPF: " + cpf + "\nNome: " + nome + "\nEndereco: " + endereco
                + "\nBairro:" + bairro + "\nCidade:" + cidade + "\nEstado: " + estado + "\nDataHoraCadastro: "
                + dataHoraCadastro + "\nLote: " + numeroLote + "\n";
    }

}
