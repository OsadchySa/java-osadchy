package lesson6;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        getGmails();
    }
    @SneakyThrows
    public static void getGmails() {
        Path source = Paths.get("emails.txt");
        Path target = Paths.get("result.txt");

        try(
            BufferedReader reader = Files.newBufferedReader(source);
            BufferedWriter writer = Files.newBufferedWriter(target);
        ) {
            String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    if (line.endsWith("gmail.com")) {
                        String[] split = line.split("\t\t\t");
                        writer.write(split[split.length - 1]);
                        writer.newLine();
                    }
                }
        }
    }
}
