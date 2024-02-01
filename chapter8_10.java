public class Student {
    private String first = ""; // student's first name
    private String last = "";  // student's last name

    
    public Student() {
        System.out.println("Creating a new Student");
    }

    
    public Student(String first, String last) {
        System.out.println("Creating a new Student with first = " + first + ", last = " + last);
    }

   
    public void setFirst(String first) {
        System.out.println("Setting first name to: " + first);
    }

    
    public void setLast(String last) {
        System.out.println("Setting last name to: " + last);
    }

   
    public void printFullName() {
        System.out.println("Printing full name");
    }

   
}
