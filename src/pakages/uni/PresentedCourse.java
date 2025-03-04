package pakages.uni;

import java.util.ArrayList;

public class PresentedCourse {

    public int id;
    public static ArrayList<PresentedCourse> presentedCoursesList = new ArrayList<>();
    public int courseId;
    public int professorId;
    public int capacity;
    public static ArrayList<Integer> studentlds;

    public PresentedCourse(int courseId, int professorId, int capacity){

        this.courseId = courseId;
        this.professorId = professorId;
        this.capacity = capacity;

        studentlds = new ArrayList<>(capacity);

        presentedCoursesList.add(this);
        this.id = presentedCoursesList.size();
    }

    public static PresentedCourse findById(int id){

            return presentedCoursesList.get(id - 1);
    }

    public void addStue (int stuId){
        if(studentlds.size() < capacity) {
            studentlds.add(stuId);
        }
        else{
            System.out.println("this course does not have capacity");
        }
    }

}
