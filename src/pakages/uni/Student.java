package pakages.uni;

import java.util.ArrayList;

public class Student {

    public int id;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public int personId;
    public final int entranceYear;
    public int majorID;
    public String studentCode;

    public Student (int personId, int entranceYear, int majorID){

        this.entranceYear = entranceYear;
        this.personId = personId;
        this.majorID =  majorID;
        if(Major.findById(majorID) != null) {
            Major.findById(majorID).addStu();
        }
        setStudentCode();
        studentList.add(this);
        id = studentList.size();

    }

    public static Student findById(int id){

            return studentList.get(id - 1);

    }

    public void setStudentCode(){

        int year = entranceYear % 1000;
        String majorID = "";
        String numOfMajor = "";
        int numOfMajor1 = 0;
        if(this.majorID < 10){
        majorID = "0" + String.valueOf(this.majorID);
        }
        else{
            majorID =  String.valueOf(this.majorID);
        }
        for(Student students : studentList){
            if(students.majorID == this.majorID){
                numOfMajor1++;
            }
        }
        if(numOfMajor1 < 10){
            numOfMajor = "0" + String.valueOf(numOfMajor1);
        }
        else {
            numOfMajor = String.valueOf(numOfMajor1);

        }
        studentCode = year + majorID + numOfMajor ;

    }
}
