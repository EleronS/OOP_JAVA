package ru.gb.oseminar;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.UserComparator;
import ru.gb.oseminar.view.StudentView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("teacher1","teacher1","teacher1","date1");
        Teacher teacher2 = new Teacher("teacher2","teacher2","teacher2","date2");
        UserComparator<Teacher> comp = new UserComparator<>();
        System.out.println(comp.compare(teacher1,teacher2));
        StudentView studentView1 = new StudentView();
        studentView1.sendOnConsole(List.of(new Student(
                "stud1","stud1","stud1","2")));
    }
}
