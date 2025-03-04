package pakages.base;

import java.util.ArrayList;

public class Person {

    public int id;
    public static ArrayList<Person> personList = new ArrayList<>();
    public String name;
    public String  nationalID;
    public static int numOfStu = 0;

    public Person(String name, String nationalID ){

        this.name = name;
        this.nationalID = nationalID;
        numOfStu++;
        personList.add(this);
        id = personList.size();
    }

    public static Person findById (int id){
                return personList.get(id - 1);
    }


}
