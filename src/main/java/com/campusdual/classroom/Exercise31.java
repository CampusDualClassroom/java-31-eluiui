package com.campusdual.classroom;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise31 {

    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/lorem.txt");
        Path pathmalo = Paths.get("src/main/resources/florem.txt");
        try {
            Files.lines(path).forEach(variable ->System.out.println(variable));
            Files.lines(pathmalo).forEach(variable ->System.out.println(variable));
        } catch (Exception e) {
            System.err.println("Error al leer el archivo " + e.getMessage());
        }
    }
}