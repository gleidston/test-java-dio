package br.com.ola;

import br.com.ola.model.Gato;
import br.com.ola.model.Livro;

public class ola {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro  = new Livro( "o gato de botas " ,"30/12/2018",300  );

        System.out.println("ola seja bem vindo ao sistema :");
        System.out.println(gato);

    }
}
