package org.example.sem1.hm6.teacher;

import org.example.sem1.hm6.user.User;

import java.util.Comparator;

public class Teacher extends User {

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth, Long countMaxId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
