package org.example;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String asciiArt = FigletFont.convertOneLine("Hello world");
        System.out.println("Hello again");
        System.out.println(asciiArt);
    }
}
