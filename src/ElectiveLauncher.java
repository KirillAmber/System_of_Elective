import ExceptionsForElective.WrongMark;
import ExceptionsForElective.WrongName;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class ElectiveLauncher {
    public static void main(String[] args) throws WrongName, WrongMark {
        Map<String, Integer> archive_of_marks = new TreeMap<>();
        Random random = new Random();

        Teacher teacher = new Teacher("Kirill");
        Student student1 = new Student("James");
        Student student2 = new Student("Roger");
        Student student3 = new Student("Romeo");

        StudyCourse course_of_biology = new StudyCourse("Course of Biology", 30);

        teacher.openCourse(course_of_biology);

        student1.enrol_in_course(course_of_biology);
        student2.enrol_in_course(course_of_biology);
        student3.enrol_in_course(course_of_biology);

        while(course_of_biology.getPeriod_day() > 0){
            course_of_biology.studying();
        }

        if(course_of_biology.getPeriod_day() == 0){
            for(Student student : course_of_biology.getList_of_members())
                teacher.rate_student(archive_of_marks, student, random.nextInt(5)+1);
        }
        System.out.println(archive_of_marks);
    }
}
