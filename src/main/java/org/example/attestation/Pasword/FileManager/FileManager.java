package org.example.attestation.Pasword.FileManager;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    private List<File> files = null;

    public void addFile(File file) {
        if (file == null) {
            throw new IllegalArgumentException("Файл не может быть пустым");
        } else if (!file.isFile()) {
            throw new IllegalArgumentException("Некорректный тип файла: " + file.getName());
        }
        files.add(file);
    }

    // Метод для чтения файла
    public String readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("Файл " + fileName + " не найден");
        }
        return new Scanner(file).useDelimiter("\\Z").next();
    }

    // Метод для записи в файл
    public boolean writeFile(String fileName, String content) throws IOException, FileNotFoundException {
        try (Writer writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Метод для копирования файлов
    public boolean copyFile(String srcFileName, String dstFileName) throws IOException, FileNotFoundException {
        try {
            Files.copy(Paths.get(srcFileName), Paths.get(dstFileName));
            return true;
        } catch (IOException e) {
            e.printStackTrace();return false;
        }
    }
}