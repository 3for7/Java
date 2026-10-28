class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Teacher: " + name);
    }
}

class Department {
    String departmentName;
    Teacher teacher;

    Department(String departmentName, Teacher teacher) {
        this.departmentName = departmentName;
        this.teacher = teacher;
    }

    void display() {
        System.out.println("Department: " + departmentName);
        teacher.display();
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Kishore");

        Department d1 = new Department("CSE", t1);

        d1.display();
    }
}
