package org.example.sem1.hm6.user;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {

    List<T> getAll();

    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);

    void create(String firstName, String secondName, String patronymic, String dateOfBirth);

}
