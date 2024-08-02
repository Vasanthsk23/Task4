package question4;

import java.util.HashMap;

public class Student {


    private HashMap<String,Integer> map =new HashMap<String, Integer>();

    public HashMap<String, Integer> getMap() {
        return this.map;
    }

    public void setMap(HashMap<String, Integer> map) {
        this.map = map;
    }

    public void addStudent(String name, Integer grade){
        this.map.put(name, grade);
        System.out.println("Successfully Added");
    }

    public void removeStudent(String name){
        map.remove(name);
        System.out.println("Successfully Removed");
    }

    public Integer displayGrade(String name){
        return map.get(name);  //map.get(key)--> will return the grade value
    }


}
