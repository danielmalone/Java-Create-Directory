package com.finepointmobile;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hi!");

        Scanner reader = new Scanner(System.in);
        String folderName = reader.nextLine();
        System.out.println(folderName);

        File file = new File("/Users/danielmalone/Documents/" + folderName);
        if (!file.exists()) {
            System.out.println("Creating folder...");
            file.mkdir();
        } else {
            System.out.println(folderName + " already exists.");
        }
    }
}
