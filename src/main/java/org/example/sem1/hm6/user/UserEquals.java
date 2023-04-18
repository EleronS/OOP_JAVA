package org.example.sem1.hm6.user;

import org.example.sem1.hm6.user.User;

/* помещаем проверочные методы в отдельный класс*/
public class UserEquals {
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (user.getFirstName() != null ? !user.getFirstName().equals(user.getFirstName()) :
                user.getFirstName() != null) {
            return false;
        }
        if (user.getSecondName() != null ? !user.getSecondName().equals(user.getSecondName()) :
                user.getSecondName() != null) {
            return false;
        }
        if (user.getPatronymic() != null ? !user.getPatronymic().equals(user.getPatronymic()) :
                user.getPatronymic() != null) {
            return false;
        }
        return user.getDateOfBirth() != null ? user.getDateOfBirth().equals(user.getDateOfBirth()) :
                user.getDateOfBirth() == null;
    }
}