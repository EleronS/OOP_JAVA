package org.example.sem1.hm6.student;

import org.example.sem1.hm6.teacher.Teacher;

import java.util.List;
/* deleted setStudent
* deleted getTeacher
* and setTeacher
* students and Teacher field factor final
 */
public class StudentGroup implements Iterable<Student>{
    final List<Student> students;
    final Teacher teacher;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }


    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }

}
