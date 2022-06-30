package com.nology.book.data;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.nology.books.LibraryBook;
import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class CSVFileToJsonFile {

    public static <object> void main(String[] args) throws IOException {
        File input = new File("/Users/patriciaedwards/Desktop/madagascar/LibraryProject/src/main/java/com/nology/book/data/books_data.csv");
        File output = new File("/Users/patriciaedwards/Desktop/madagascar/LibraryProject/src/main/java/com/nology/book/data/books_data.json");

        CsvSchema csvSchema = CsvSchema.builder().setUseHeader(true).build();
        CsvMapper csvMapper = new CsvMapper();

        // Read data from CSV file
        List<object> readAll = (List<object>) csvMapper.readerFor(Map.class).with(csvSchema).readValues(input).readAll();

        ObjectMapper mapper = new ObjectMapper();

        // Write JSON formated data to output.json file
        mapper.writerWithDefaultPrettyPrinter().writeValue(output, readAll);

        // Write JSON formated data to stdout
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(readAll));
    }


}

