package com.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by davit on 07.02.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String fileName = Main.class.getResource("/longitude.csv").getFile();
        String fileName2 = Main.class.getResource("/latitude.csv").getFile();
        List<String> lon = new ArrayList<>();
        List<String> lat = new ArrayList<>();

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(s -> {
                System.out.println(s);
                System.out.println("=========");
                lon.addAll(Arrays.asList(s.split(";")));
            });

            try (Stream<String> stream2 = Files.lines(Paths.get(fileName2))) {
                stream2.forEach(s -> {
                    System.out.println(s);
                    System.out.println("=========");
                    lat.addAll(Arrays.asList(s.split(";")));
                });


            } catch (IOException e) {
                e.printStackTrace();
            }
            lon.forEach(s -> {
                System.out.println(s);
            });
            lat.forEach(s -> {
                System.out.println(s);
            });
            System.out.println("=========");
        }
    }
}
