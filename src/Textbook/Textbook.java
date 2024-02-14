package Textbook;

// Textbooks have manufacturer, title, authors, index, page number
public class Textbook {
    private String manufacturer;  //ex: Pearson, Holt Mcdougal
    private String title;  //ex: Algebra 1, Geometry
    private String authors;  //ex: Sarah Conners, Micheal B. Jordan
    private int pages;  // ex: page number

    public Textbook(String manufacturer, String title, String authors, int pages){ //Constructor
        this.manufacturer = manufacturer;
        this.authors = authors;
        this.title = title;
        this.pages = pages;
    }

    //The field of getters and setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override //Just so everything comes out correctly
    public String toString(){
        return "Manufactured: " + manufacturer + "\n Textbook: " + title + "\n Written by: " + authors + "\n Page amount: " + pages;
    }

}
