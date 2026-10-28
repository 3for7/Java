public class ClassesAndObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 100;
        s1.name = "Elliot";
        s1.age = 25;
        System.out.println("Name: " + s1.name + "\nId: " + s1.id + "\nAge: " + s1.age);
    }
}
