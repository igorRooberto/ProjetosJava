package model;

public class Livro {

    private String tittle;
    private String author;
    private Integer yearPublication;

    public Livro(String tittle,String author, Integer yearPublication){
        this.tittle = tittle;
        this.author = author;
        this.yearPublication = yearPublication;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Integer getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(Integer yearPublication) {
        this.yearPublication = yearPublication;
    }

    public void exibirDetalhes(){
        System.out.println("the tittle of the book is: "+getTittle());
        System.out.println("the author's name is: " + getAuthor());
        System.out.println("the year of publication is: "+getYearPublication());
    }


}
