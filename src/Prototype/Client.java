package Prototype;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student apr22Batch = new Student();
        apr22Batch.setBatch("Apr 2022");
        apr22Batch.setAvgBatchPsp(80.9);

        studentRegistry.register("apr22Batch",apr22Batch);
    }
    public static void main(String[] args){
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student sid = studentRegistry.get("apr22Batch").clone();
    }
}
