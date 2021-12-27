package br.com.ola.model;

public class Livro {
    private String nome ;
    private String data ;
    private Integer numero;

    public Livro(String nome, String data, Integer numero) {
        this.nome = nome;
        this.data = data;
        this.numero = numero;
    }

    public Livro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
