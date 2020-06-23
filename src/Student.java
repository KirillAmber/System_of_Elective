import ExceptionsForElective.WrongName;

public class Student {
    private String name;

    public Student(String name) throws WrongName {
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

    public void enrol_in_course(StudyCourse course){
        if(course.isOpen())
            course.addMember(this);
        else
            System.out.println("Course is closed");
    }

    public String getName() {
        return name;
    }
}
