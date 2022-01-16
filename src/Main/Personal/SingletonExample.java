package Main.Personal;

class Student {

    private static Student instance;

    private Student() {
    }

    public static Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }

    private void test() {
        System.out.println("private 메소드");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        Student student1 = Student.getInstance();
        System.out.println(student1);
        Student student2 = Student.getInstance();
        System.out.println(student2);
    }
}

