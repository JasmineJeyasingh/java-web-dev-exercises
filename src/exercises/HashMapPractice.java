package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        Integer id;
        do{
            System.out.print("Student Id: ");
            id = input.nextInt();
            input.nextLine();
            if(!id.equals(-1)){
                System.out.print("Enter student name: ");
                newStudent = input.nextLine();
                students.put(id, newStudent);
            }
        }while(!id.equals(-1));

        for(Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ":" + student.getValue());
        }


    }
}
