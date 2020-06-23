import java.util.ArrayList;
import java.util.List;

public class StudyCourse {
    private String name_of_course;
    private List<Student> list_of_members;
    private int period_day;
    private boolean isOpen;

    public StudyCourse(){
        name_of_course = "NoName";
        list_of_members = new ArrayList<>();
        period_day = 0;
        isOpen = false;
    }
    public StudyCourse(String name_of_course, int period_day){
        this.name_of_course = name_of_course;
        this.period_day = period_day;
        list_of_members = new ArrayList<>();
        isOpen = false;
    }

    public StudyCourse(String name_of_course, int period_day, List<Student> list_of_members){
        this.name_of_course = name_of_course;
        this.period_day = period_day;
        this.list_of_members = list_of_members;
        isOpen = false;
    }


    public void addMember(Student student){
        list_of_members.add(student);
    }

    public void studying(){
        if(period_day > 0) {
            period_day -= 1;
        }
        else if(period_day == 0){
            System.out.println("The course is completed");
        }
    }

    public int getPeriod_day() {
        return period_day;
    }

    public List<Student> getList_of_members() {
        return list_of_members;
    }

    public String getName_of_course() {
        return name_of_course;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
