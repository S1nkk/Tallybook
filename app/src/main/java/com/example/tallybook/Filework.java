package com.example.tallybook;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Filework
{
    public void FileReader()
    {

    }


    public void FileWriter(double num, double price, double Tally) throws IOException {
        FileWriter FWriter = new FileWriter("Source.txt",true);
        LocalDate date = LocalDate.now();
        String new_date =""+date;
    }
}
