package org.example.attestation.Pasword.FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        // Добавляем файлы
        fileManager.addFile(new File("input.txt"));
        fileManager.addFile(new File("output.txt"));

        System.out.print("Список файлов: ");
        //for (File file : fileManager.getAllFiles()) {
        //    System.out.printf("\"%s\"
        //            ", file.getName());
        //}

        try {
            // Читаем файл "input.txt"
            String content = fileManager.readFile("input.txt").trim();
            System.out.println("Содержание файла: " + content);

            // Записываем данные в файл "output.txt"
            boolean result = fileManager.writeFile("output.txt", content);
            if (result) {
                System.out.println("Данные успешно записаны в файл.");
            } else {
                throw new IOException("Ошибка записи данных в файл.");}

            // Копируем файл "input_copy.txt" в папку "docs"
            result = fileManager.copyFile("input_copy.txt", "docs");
            if (result) {
                System.out.println("Файл успешно скопирован.");
            } else {
                throw new IOException("Ошибка копирования файла.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.exit(0);
    }
}