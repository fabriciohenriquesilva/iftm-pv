/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author iftm
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private int edicao;
    private String isbn;

    public Livro() {
    }

    public Livro(String titulo, String autor, String editora, int anoPublicacao, int edicao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo 
                + ", autor=" + autor 
                + ", editora=" + editora 
                + ", anoPublicacao=" + anoPublicacao 
                + ", edicao=" + edicao 
                + ", isbn=" + isbn + '}';
    }
    
}
