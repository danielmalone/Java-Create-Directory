package com.finepointmobile;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        System.out.println("hi!");

        File file = new File("/Users/danielmalone/Documents/_JavaDir");
        if (!file.exists()) {
            System.out.println("Creating folder...");
            file.mkdir();
        } else {
            System.out.println("Already exists.");
        }
    }
}
