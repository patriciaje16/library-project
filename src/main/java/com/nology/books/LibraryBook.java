package com.nology.books;

import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryBook {
    private String number;
    private String title;
    private String author;
    private String genre;
    private String subgenre;
    private String publisher;


    public LibraryBook(String number, String title, String author, String genre, String subgenre, String publisher) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.subgenre = subgenre;
        this.publisher = publisher;
    }

    public String getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getSubgenre() {
        return subgenre;
    }

    public String getPublisher() {
        return publisher;
    }

    public String toString() {
        return "" + number + ", title: " + title + ", author: " + author
                + ", genre: " + genre + ", subgenre: " + subgenre + ", publisher: " + publisher + "";
    }

    public static List readBooksData() throws IOException {
        List<LibraryBook> booksList = new ArrayList<>();

        String path = "/Users/patriciaedwards/Desktop/madagascar/LibraryProject/src/main/java/com/nology/book/data/books_data.csv";
        String line = "";
        String[] CSVarray = new String[0];

        BufferedReader br = new BufferedReader(new FileReader(path));
        while ((line = br.readLine()) != null) {

            CSVarray = line.split(",");
            String number = CSVarray[0];
            String title = CSVarray[1];
            String author = CSVarray[2];
            String genre = CSVarray[3];
            String subgenre = CSVarray[4];
            String publisher = CSVarray[5];
            LibraryBook book = new LibraryBook(number, title, author, genre, subgenre, publisher);
            booksList.add(book);



        }


        return booksList;
    }

    public static String getJSONFromFile(String filename) {
        String jsonText = "";
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(filename));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText += line + "\n";
            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonText;
    }


    public static void main(String[] args) throws ParseException, IOException {
       // String strJson = getJSONFromFile("/Users/patriciaedwards/Desktop/madagascar/LibraryProject/src/main/java/com/nology/book/data/books_data.json");

        System.out.println(LibraryBook.readBooksData());

        }



}




























