package com.AlyssaMoore;

import java.io.*;

public class Main {

    public static void main(String[] args){

        // Getting os name as a string
        String os = System.getProperty("os.name");
        // Creating empty File for use with either Windows or other OS's
        File testFile = new File(" ");

        if (os.contains("Windows")) {
            // Creating file in data directory (within project directory)
            testFile = new File("C:\\Users\\Alyssa\\IdeaProjects\\Lab 5 pt 11\\data\\test.txt");
        }
        else {
            // Creating file in data directory (within project directory)
            testFile = new File("C:/Users/Alyssa/IdeaProjects/Lab 5 pt 11/data/test.txt");
        }
        // Writing string "Data" to file, then closing it
        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(testFile));
            bufWriter.write("Data");
            bufWriter.close();
        }
        // Catching IOException
        catch (IOException ioe) {
            System.out.println("Sorry, there was an IOException");
        }

    }
}