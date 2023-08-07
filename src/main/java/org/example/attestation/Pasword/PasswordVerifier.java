package org.example.attestation.Pasword;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordVerifier {
    private static Pattern minLengthPattern = Pattern.compile("^.{8}$");
    private static Pattern digitPattern = Pattern.compile("\\d+");
    private static Pattern uppercasePattern = Pattern.compile("[A-Z]+");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        try {
            if (!validatePassword(password)) {
                throw new IllegalArgumentException("Пароль не соответствует правилам");
            }
            if(validatePassword(password)){
                System.out.println("Пароль соответствует правилам.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    private static boolean validatePassword(String password) {
        return minLengthPattern.matcher(password).matches() &&
                digitPattern.matcher(password).matches() &&
                uppercasePattern.matcher(password).matches();
    }
}
