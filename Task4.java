interface User {
    void login();
}

    class Student implements User {
        public void login() {
           System.out.println("Student logged in.");
         }
    }

    class Instructor implements User {
        public void login() {
            System.out.println("Instructor logged in.");
        }

        public void uploadCourse() {
             System.out.println("Instructor uploaded a course.");
        }
    }

    public class Task4 {
        public static void main(String[] args) {
            User student = new Student();
            student.login();

            Instructor instructor = new Instructor();
            instructor.login();
            instructor.uploadCourse();
        }
}