package OOPS;



public class client {
    public static void main(String[] args) {

        Course course = new Course("Java");
        Student  original = new Student("ABC",2,course);

//        Student s2 = new Student(student); // creting student using copy constructor

        //student sallow copy
        Student sallowCopy = original.sallowCopy();
        Student deepCopy = original.deepCopy();
    }
}
