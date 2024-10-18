class D {
    private int dd = 0;
    private int mm = 0;
    private int yyyy = 0;

    public void setDate(int dd, int mm, int yyyy) {
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }

    public String getDate() {
        String currentDate = dd + "/" + mm + "/" + yyyy;
        return currentDate;
    }
}

class Student {
    private String nameOfStudent;
    private int studentId;
    private String nameOfCourse;
    private D dateOfAdmission;

    public Student() {
        this.nameOfStudent = "";
        this.studentId = 1000;
        this.nameOfCourse = "Java FSD";
        this.dateOfAdmission = new D();
        this.dateOfAdmission.setDate(01, 01, 1995);
    }

    public Student(String nameOfStudent, int studentId, String nameOfCourse, int dd, int mm, int yyyy) {
        this.nameOfStudent = nameOfStudent;
        this.studentId = studentId;
        this.nameOfCourse = nameOfCourse;
        this.dateOfAdmission = new D();
        this.dateOfAdmission.setDate(dd, mm, yyyy);
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getNameOfStudent() {
        return this.nameOfStudent;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setDateOfAdmission(int dd, int mm, int yyyy) {
        this.dateOfAdmission.setDate(dd, mm, yyyy);
    }

    public String getDateOfAdmission() {
        String dateOfAdmission = this.dateOfAdmission.getDate();
        return dateOfAdmission;
    }

    public void printStudentInformation() {
        System.out.print("Name of Student:    ");
        System.out.println(this.getNameOfStudent());

        System.out.print("Student ID:         ");
        System.out.println(this.getStudentId());

        System.out.print("Name of Course:     ");
        System.out.println(this.getNameOfCourse());

        System.out.print("Date of Admission:  ");
        System.out.println(this.getDateOfAdmission());
    }
}

class Employee {
    private String nameOfEmployee;
    private int employeeId;
    private String nameOfDesignation;
    private D dateOfJoining;

    public Employee() {
        this.nameOfEmployee = "";
        this.employeeId = 2000;
        this.nameOfDesignation = "Intern";
        this.dateOfJoining = new D();
        this.dateOfJoining.setDate(01, 01, 1995);
    }

    public Employee(String nameOfEmployee, int employeeId, String nameOfDesignation, int dd, int mm, int yyyy) {
        this.nameOfEmployee = nameOfEmployee;
        this.employeeId = employeeId;
        this.nameOfDesignation = nameOfDesignation;
        this.dateOfJoining = new D();
        this.dateOfJoining.setDate(dd, mm, yyyy);
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }

    public String getNameOfEmployee() {
        return this.nameOfEmployee;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setNameOfDesignation(String nameOfDesignation) {
        this.nameOfDesignation = nameOfDesignation;
    }

    public String getNameOfDesignation() {
        return nameOfDesignation;
    }

    public void setDateOfJoining(int dd, int mm, int yyyy) {
        this.dateOfJoining.setDate(dd, mm, yyyy);
    }

    public String getDateOfJoining() {
        String dateOfJoining = this.dateOfJoining.getDate();
        return dateOfJoining;
    }

    public void printEmployeeInformation() {
        System.out.print("Name of Employee:    ");
        System.out.println(this.getNameOfEmployee());

        System.out.print("Employee ID:         ");
        System.out.println(this.getEmployeeId());

        System.out.print("Designation:         ");
        System.out.println(this.getNameOfDesignation());

        System.out.print("Date of Joining:     ");
        System.out.println(this.getDateOfJoining());
    }
}

public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student("Ayush", 2001, "Intern", 05, 05, 2002);
        Employee e1 = new Employee("Ayush", 2001, "Intern", 05, 05, 2023);

        s1.printStudentInformation();
        e1.printEmployeeInformation();
    }
}