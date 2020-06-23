import ExceptionsForElective.WrongMark;
import ExceptionsForElective.WrongName;

import java.util.List;
import java.util.Map;

public class Teacher {
    private String name;

    public Teacher(String name) throws WrongName {
        if(!(name.charAt(0) >= 65 && name.charAt(0)<=90))
            throw new WrongName("The name must begin with a capital letter!");
        else{
        for(int i = 1; i<name.length(); i++){
            if(!(name.charAt(i) >= 97 && name.charAt(i)<=122))
                throw new WrongName("The name must contain only letters of the English alphabet");
        }
            this.name = name;
        }
    }
    public void openCourse(StudyCourse course){
        course.setOpen(true);
    }
    public void closeCourse(StudyCourse course){
        course.setOpen(false);
    }
    public void rate_student(Map<String, Integer> archive, Student student, int mark) throws WrongMark {
        if(mark < 1 || mark >5){
            throw new WrongMark("Mark must be from 1 to 5");
        }
        else
        archive.put(student.getName(), mark);
    }
}
