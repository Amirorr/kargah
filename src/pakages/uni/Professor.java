package pakages.uni;

import java.util.ArrayList;

public class Professor {

    public int id;
    public static ArrayList<Professor> professorList = new ArrayList<>();
    public int personId;
    public int majorId;

    public Professor(int personId, int majorId){
        this.majorId = majorId;
        this.personId = personId;
        professorList.add(this);
        this.id = professorList.size();
    }
    public static Professor findById(int id){

            return professorList.get(id - 1);
    }

}
