package model;

public class Ebook extends Livro {

    private String format;


    public Ebook(String tittle, String author, Integer yearPublication, String format) {
        super(tittle, author, yearPublication);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("the tittle of the book is: "+getTittle());
        System.out.println("the author's name is: " + getAuthor());
        System.out.println("the year of publication is: "+getYearPublication());
        System.out.println("The Ebook format is: "+ getFormat());
    }
}
