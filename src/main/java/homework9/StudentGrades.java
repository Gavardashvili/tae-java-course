/** @author Lizi Gavardashvili*/
package homework9;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StudentGrades {
    private Map<String, List<Integer>> students = new HashMap<>();
    public StudentGrades() {
        students.put("Anna", List.of(85, 92, 78, 90));
        students.put("Beka", List.of(70,65,80,75));
        students.put("Cika", List.of(95,98,92,100));
    }


    public double averageFor(String name){
        List<Integer> grades = students.get(name);
        int sum = 0;
        for (int i : grades) {
            sum+=i;

        }
        return (double) sum /grades.size();
    }

    public static void main(String[] args) {
        StudentGrades stgr = new StudentGrades();
        for (String name : stgr.students.keySet()) {
            System.out.println(name + " " + stgr.students.get(name) + " avg = " + stgr.averageFor(name));

        }


    }



}
