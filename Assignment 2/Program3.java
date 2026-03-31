import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

 class Main3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        // Create
        list.add(new Student(1, "A"));
        list.add(new Student(2, "B"));

        // Read
        for (Student s : list)
            System.out.println(s.id + " " + s.name);

        // Update
        list.get(0).name = "Updated";

        // Delete
        list.remove(1);

        System.out.println("After Update/Delete:");
        for (Student s : list)
            System.out.println(s.id + " " + s.name);
    }
}