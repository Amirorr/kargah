package pakages.uni;

import pakages.base.Person;

import java.util.HashMap;

public class Transcript {
    public int stuId;
    public HashMap<Integer, Double> transcript;

    public Transcript (int stuId){
        this.stuId = stuId;
        transcript = new HashMap<>();
    }

    public void setGrade (int presentedCourseId, double grade){

        PresentedCourse presentedCourse = PresentedCourse.findById(presentedCourseId);

        if(presentedCourse != null){
            for(int stuId : PresentedCourse.studentlds){
                if(this.stuId == stuId){
                    transcript.put(presentedCourseId, grade);
                }
            }
        }
    }

    public void printTranscript(){

        Student student  = Student.findById(stuId);
        Person person = Person.findById(Student.findById(stuId).personId);
        if(student != null){
            if(person != null){
                System.out.println("NAME:" + person.name + "Student Code" + student.studentCode );

                for(Integer presentedCourseId1 : transcript.keySet()){
                    int courseId = PresentedCourse.findById(presentedCourseId1).courseId;
                    System.out.println(  Course.fidById(courseId).title + ":" + transcript.get(presentedCourseId1));
                }

            }
            else{
                    System.out.println("this person not exist");
            }

        }
        else{
            System.out.println("this student not exist");
        }

        }

        public double getGPA(){
            double sumOfGrade = 0;
            int units = 0;
            for (Integer courseId3 : transcript.keySet()){
                int unit = 0;
                unit += Course.fidById(courseId3).units;
                sumOfGrade +=  transcript.get(courseId3) * unit;
                units += unit;
            }
            return sumOfGrade / units;

        }


    }

