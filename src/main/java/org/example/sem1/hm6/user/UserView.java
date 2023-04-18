package org.example.sem1.hm6.user;

import org.example.sem1.hm6.user.User;

import java.util.List;

public interface UserView<T extends User>{
        void sendOnConsole(List<T> list);
}

