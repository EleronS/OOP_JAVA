package org.example.sem1.hm6.teacher;

import org.example.sem1.hm6.student.StudentGroup;
import org.example.sem1.hm6.user.UserView;

import java.util.List;
import java.util.logging.Logger;
/* удалил недействующий метод*/
public class TeacherView implements UserView<Teacher> {
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for ( Teacher user : teachers ) {
            logger.info(user.toString());
        }
    }
}


