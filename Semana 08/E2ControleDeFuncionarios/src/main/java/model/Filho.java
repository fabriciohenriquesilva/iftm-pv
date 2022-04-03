package model;

import java.util.Date;
import java.util.Objects;

public class Filho {
    private String cpf;
    private String nome;
    private String numCertNasc;
    private Date dataNascimento;

    public Filho(String cpf, String nome, String numCertNasc, Date dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.numCertNasc = numCertNasc;
        this.dataNascimento = dataNascimento;
    }

    public Filho() {
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

    public String getNumCertNasc() {
        return numCertNasc;
    }

    public void setNumCertNasc(String numCertNasc) {
        this.numCertNasc = numCertNasc;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Filho other = (Filho) obj;
        return Objects.equals(this.cpf, other.cpf);
    }

    @Override
    public String toString() {
        return "Filho{" + "cpf=" + cpf + ", nome=" + nome + ", numCertNasc=" + numCertNasc + ", dataNascimento=" + dataNascimento + '}';
    }
    
    
}
