package model;

import org.w3c.dom.ls.LSOutput;

public class PhysicalBook extends Livro {

    private Integer numberOfPages;

    public PhysicalBook(String tittle, String author, Integer yearPublication, Integer numberOfPages) {
        super(tittle, author, yearPublication);
        this.numberOfPages = numberOfPages;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("the tittle of the book is: "+getTittle());
        System.out.println("the author's name is: " + getAuthor());
        System.out.println("the year of publication is: "+getYearPublication());
        System.out.println("the number of pages in the book is: "+getNumberOfPages());
    }
}

