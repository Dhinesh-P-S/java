package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            // Create a File object for a non-existent file
            File file = new File("path/to/your/file.txt"); // Provide a valid file path here
            FileReader reader = new FileReader(file); // Trying to read the file
        } catch (IOException e) {
            // Catch the checked IOException
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}