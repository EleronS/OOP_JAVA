package org.example.sem1.hm6;

import org.example.sem1.hm6.student.Student;
import org.example.sem1.hm6.student.StudentView;
import org.example.sem1.hm6.teacher.Teacher;
import org.example.sem1.hm6.teacher.TeacherView;
import org.example.sem1.hm6.user.User;
import org.example.sem1.hm6.user.UserComparator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1","user1","user1","date1");
        User user2 = new User("user2","user2","user2","date2");
        UserComparator<User> comp = new UserComparator<>();
        System.out.println(comp.compare(user1,user2));
        StudentView studentView1 = new StudentView();
        studentView1.sendOnConsole(List.of(new Student(
                "stud1","stud1","stud1","2")));
        TeacherView teacherView1 = new TeacherView();
        teacherView1.sendOnConsole(List.of(new Teacher(
                "teacher1","teacher1","teacher1","10.10.2000")));

    }
}
