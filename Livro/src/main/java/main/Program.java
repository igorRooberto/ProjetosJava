package main;

import model.Ebook;
import model.Livro;
import model.PhysicalBook;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Livro> Livros = new ArrayList<>();

        Ebook liv1 = new Ebook("Coralina","Maria", 2005, "PDF");
        Livro liv2 = new PhysicalBook("Superman", "lexLUthor", 2002, 140);

        Livros.add(liv1);
        Livros.add(liv2);

        for(Livro livros : Livros){
            livros.exibirDetalhes();
        }
    }
}
