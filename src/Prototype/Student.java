package Prototype;

public class Student implements Prototype<Student> {
    int age;
    String name;
    String batch;
    double avgBatchPsp;
    double studentPsp;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public double getStudentPsp() {
        return studentPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    Student(){

    }
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.batch = s.batch;
        this.studentPsp = s.studentPsp;
        this.avgBatchPsp = s.avgBatchPsp;
    }
    @Override
    public Student clone(){
//       Student copy = new Student();
//       copy.age = this.age;
//       copy.name = this.name;
//       copy.batch = this.batch;
//       copy.studentPsp = this.studentPsp;
//       copy.avgBatchPsp = this.avgBatchPsp;
//       return copy;

        return new Student(this);
    }
}
