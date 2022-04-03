package controller;

import java.util.ArrayList;
import java.util.List;
import model.Livro;

public class GerenciaLivro {
    
    private List<Livro> livros;

    public GerenciaLivro() {
        livros = new ArrayList<>();
    }
    
    public boolean incluir(Livro livro){
        return livros.add(livro);
    }
    
    public boolean remover(Livro livro){
        return livros.remove(livro);
    }
    
    public void alterar(Livro livro){
        Livro livroAlterado = consultarPorTitulo(livro.getTitulo());
        
        livroAlterado.setTitulo(livro.getTitulo());
        livroAlterado.setAutor(livro.getAutor());
        livroAlterado.setEditora(livro.getEditora());
        livroAlterado.setIsbn(livro.getIsbn());
        livroAlterado.setAnoPublicacao(livro.getAnoPublicacao());
        livroAlterado.setEdicao(livro.getEdicao());
        
        livros.add(livros.indexOf(livro), livroAlterado);
    }
    
    public Livro consultarPorTitulo(String titulo){
        return livros.stream()
                .filter(li -> li.getTitulo().equals(titulo))
                .findFirst()
                .orElseThrow();
    }
}
