package org.example.sem1.hm6.student;


import org.example.sem1.hm6.user.UserView;

import java.util.List;
import java.util.logging.Logger;
/* удалил недействующий метод*/
public class StudentView implements UserView<Student> {

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<Student> students) {
        for ( Student user : students ) {
            logger.info(user.toString());
        }
    }

}
