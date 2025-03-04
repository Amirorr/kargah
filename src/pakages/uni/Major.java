package pakages.uni;

import java.util.ArrayList;

public class Major {

    public int id;
    public static ArrayList<Major> majorList = new ArrayList<>();
    public  String name;
    public final int capacity ;
    public int numOfStudents = 0;

    public Major (String name, int capacity){

        this.name = name;
        this.capacity = capacity;
        majorList.add(this);
        id = majorList.size() ;
    }
    public static Major findById(int id){
            return majorList.get(id - 1);
    }
     public void addStu(){

        if(numOfStudents < capacity){
            numOfStudents++;
        }
        else{
            System.out.println("this field does not have capacity");
        }
     }

}
