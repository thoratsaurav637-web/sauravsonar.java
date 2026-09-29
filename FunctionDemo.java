class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    class Student {
        String name;
        int Age;

        Student() {
            name = "saurav";
            Age = 21;
        }

        Student(String n, int a) {
            name = n;
            Age = a;
        }

        Student(Student s) {
            this.name = s.name;
            this.Age = s.Age;
        }

        void Display() {
            System.out.println("name: " + name + ", Age: " + Age);
        }

        Student getStudent() {
            return this;
        }
    }

    public class FuntionDemo {
        public static void main(String[] args) {

            Calculator calc = new Calculator();

            System.out.println("add two integers: " + calc.add(5, 10));
            System.out.println("add three integers: " + calc.add(5, 10, 15));
            System.out.println("add two doubles: " + calc.add(5.5, 4.5));

         //   Student s1 = new Student();
            Student s2 = new Student("saurav", 21);
            Student s3 = new Student(s2);

            s1.Display();
            s2.Display();
            s3.Display();

            Student s4 = s2.getStudent();

            System.out.println("student s4 details (reference to s2):");
            s4.Display();
        }
    }
}
