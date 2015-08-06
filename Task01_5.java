package org.sourceit.zakharov.home03;

import java.util.Scanner;

public class Task01_5 {

    public static void main(String[] args) {
        Search year = new Search();
        Scanner scanner = new Scanner(System.in);
        Book[] book = {
                new Book(1, "title1", "author1", "publishing1", 2009, 100, 500, "cover1"),
                new Book(2, "title2", "author1", "publishing2", 2010, 115, 500, "cover2"),
                new Book(3, "title3", "author2", "publishing1", 2011, 120, 500, "cover1"),
                new Book(4, "title4", "author2", "publishing2", 2012, 120, 500, "cover3"),
                new Book(5, "title5", "author3", "publishing2", 2009, 120, 500, "cover2"),
                new Book(6, "title6", "author3", "publishing1", 2010, 110, 500, "cover1"),
                new Book(7, "title7", "author4", "publishing1", 2011, 130, 500, "cover3"),
                new Book(8, "title1", "author1", "publishing3", 2012, 150, 500, "cover3"),
                new Book(9, "title2", "author1", "publishing3", 2013, 140, 500, "cover2"),
                new Book(10, "title3", "author2", "publishing4", 2014, 130, 500, "cover1"),

        };

        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].sout());
        }

        System.out.println("\nenter info for search");
        String r = scanner.next();

        for (int i = 0; i < book.length; i++) { // poisk

            if ((book[i].getAuthor().equalsIgnoreCase(r))// poisk avtor
                    || (book[i].getPublishing().equalsIgnoreCase(r))// poisk izdatela
                    || (year.search(book[i].getYear(), r))) {
//                    ||(book[i].getYear().equalsIgnoreCase(r))){   // poisk po gody
                System.out.println(book[i].sout());
            }

        }

    }
}

class Search {
    boolean search(String year, String search) {
        if (search.startsWith("1") || search.startsWith("2")) {
            if (Integer.parseInt(year) <= Integer.parseInt(search)) return false;
            else return true;
        }
        return false;
    }
}//

class Book {
    private String id;
    private String title;
    private String author;
    private String publishing;
    private String year;
    private String pages;
    private String price;
    private String cover;

    Book(int id, String title, String author, String publishing,
         int year, int pages, int price, String cover) {
        this.setId(id);
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublishing(publishing);
        this.setYear(year);
        this.setPages(pages);
        this.setPrice(price);
        this.setCover(cover);
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id = Integer.toString(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = Integer.toString(year);
    }

    public String getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = Integer.toString(pages);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = Integer.toString(price);
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String sout() {
        return id + " " + title + " " + author + " " + publishing + " " + year + " " + pages + " " + price + " " + cover;
    }

}
