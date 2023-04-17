package org.example.sem1.cw5.view;

import org.example.sem1.cw5.controller.UserController;
import org.example.sem1.cw5.model.User;
import java.util.Scanner;

//нужно реализовать через switch case
//иначе нужно долго и нудно нажимать одну и туже цифру
public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner sc = new Scanner(System.in);
        User u1 = new User(1, "f-name", "s-name", 0.0);
        User u2 = new User(1, "f-name2", "s-name2", 0.0);
        userController.addToData(u1);
        System.out.println("Введите * 1 для регистрации.");
        System.out.println("Введите * 2 для просмотра списка.");
        System.out.println("Введите * 3 для удаления пользователя.");
        System.out.println("Введите * 4 для пополнения баланса.");
        System.out.println("Введите * 5 для снятия со счета.");
        while (sc.nextInt() <= 5) {

            if (sc.nextInt() == 1) {

                System.out.println("Введите имя и фамилию для создания профиля: ");
                userController.saveNewUser(1, sc.nextLine(), sc.nextLine(), 0.0);

            }
            else if (sc.nextInt() == 2) {
                System.out.println(userController.getUserData(u1));
            }
            else if (sc.nextInt() == 3) {
                userController.deleteFromData(u1);
                System.out.println("пользователь " + u1.getFirstName() + u1.getSecondName() + " удален.");
            }
            else if(sc.nextInt() == 4) {
                System.out.println("Ваш балланс: " + u1.getBalance());
                System.out.println("Введите число пополнения ");
                u1.setBalance(u1.getBalance() + sc.nextDouble());
                System.out.println("Ваш балланс: " + u1.getBalance());

            }
            else{
                System.out.println("Ваш балланс: " + u1.getBalance());
                System.out.println("Введите число снятия ");
                if (u1.getBalance() >= sc.nextDouble()) {
                    u1.setBalance(u1.getBalance() - sc.nextDouble());


                }   System.out.println("Ваш балланс: " + u1.getBalance());
            }

        }
    }
}
