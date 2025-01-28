package OOPS;

public class Student implements Cloneable{
    private String name;
    private int rollNo;
    private Course course;


    //by default sallow copy
    @Override
    public Student clone() throws CloneNotSupportedException{
        Student cloned = (Student) super.clone();

        //deep copy if complex object needed
        cloned.course =  (Course) course.clone();
        return cloned;
    }


    //sallow copy
    public Student sallowCopy() {
        return new Student(this.name, this.rollNo, this.course);
    }

    //deep copy
    public Student deepCopy() {
        Student cloned = new Student(this.name, this.rollNo, this.course);
        cloned.course = new Course(this.course.getName());
        return cloned;
    }


    //default
    public Student() {

    }
    //parameterize cons
    public Student(String name, int rollNo, Course course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }
    //copy constructor
    public Student(Student s) {
        this.name = s.name;
        this.rollNo = s.rollNo;
    }
}
