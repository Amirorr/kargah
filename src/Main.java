import pakages.base.Person;
import pakages.uni.*;

public class Main {
    public static void main(String[] args) {

        Major major0 = new Major("physic", 20);
        Major major1 = new Major("civil eng", 50);

        Person person0 = new Person("amir", "0701425689");
        Person person1 = new Person("amirali", "520425689");
        Person person2 = new Person("amirabas", "07756425689");
        Person person3 = new Person("amirmamad", "092425689");
        Person person4 = new Person("amirhossein", "06258789");

        Student student0 = new Student(1, 1402, 1);
        Student student1 = new Student(2, 1400, 1);
        Student student2 = new Student(3, 1403, 2);

        String nameStu0 = "";
        String nameStu1 = "";
        String nameStu2 = "";

        // name student0
        if(Person.findById(student0.personId) != null){
            nameStu0 = Person.findById(student0.personId).name;
        }
        else{
            System.out.println("this student not exist");
        }

        //name student1
        if(Person.findById(student1.personId) != null){
            nameStu1 = Person.findById(student1.personId).name;
        }
        else{
            System.out.println("this student not exist");
        }

        if(Person.findById(student2.personId) != null){
            nameStu2 = Person.findById(student2.personId).name;
        }
        else{
            System.out.println("this student not exist");
        }

        System.out.println("Name:" + nameStu0 + " | Student Code:" + student0.studentCode);
        System.out.println("Name:" + nameStu1 + " | Student Code:" + student1.studentCode);
        System.out.println("Name:" + nameStu2 + " | Student Code:" + student2.studentCode);

        Professor professor1 = new Professor(4, 1);
        Professor professor2 = new Professor(5, 2);

        String nameProf1 = "";
        String nameProf2 = "";

        if(Person.findById(professor1.personId) != null){
            nameProf1 = Person.findById(professor1.personId).name;
        }
        else{
            System.out.println("this professor not exist");
        }

        if(Person.findById(professor2.personId) != null){
            nameProf2 = Person.findById(professor2.personId).name;
        }
        else{
            System.out.println("this professor not exist");
        }

        System.out.println("ID: " + professor1.id + "  " + "Name: " + nameProf1);
        System.out.println("ID: " + professor2.id + "  " +  "Name: " + nameProf2);

        Course course1 = new Course("math 1", 3);
        Course course2 = new Course("AP", 4);
        Course course3 = new Course("physic", 3);

        PresentedCourse presentedCourse1 = new PresentedCourse(1, 1, 30);
        PresentedCourse presentedCourse2 = new PresentedCourse(2, 1, 80);
        PresentedCourse presentedCourse3 = new PresentedCourse(3,2,50);

        presentedCourse1.addStue(1);
        presentedCourse1.addStue(2);
        presentedCourse2.addStue(1);
        presentedCourse2.addStue(2);
        presentedCourse2.addStue(3);
        presentedCourse3.addStue(3);

        Transcript transcript1 = new Transcript(1);
        Transcript transcript2 = new Transcript(2);
        Transcript transcript3 = new Transcript(3);

        transcript1.setGrade(1, 19.5);
        transcript1.setGrade(2, 15.56);

        transcript2.setGrade(1, 12.96);
        transcript2.setGrade(2, 16.43);

        transcript3.setGrade(2, 20);
        transcript3.setGrade(3, 13.76);

        transcript1.printTranscript();
        System.out.println("average grade " + transcript1.getGPA());

        transcript2.printTranscript();
        System.out.println("average grade " + transcript2.getGPA());

        transcript3.printTranscript();
        System.out.println("average grade " + transcript3.getGPA());

    }
}
