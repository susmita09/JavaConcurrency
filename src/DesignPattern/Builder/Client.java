package DesignPattern.Builder;

public class Client {
    public static void main(String[] args){
        //version 0
//      Builder build = new Builder();
//      build.setContent("Hi, welcome");
//      build.setRecipient("Aman");
//      build.setSender("Susmita");
//      build.setIsDelivered(true);
//      build.setTimestamp(12);

        //version v1
//        Builder build = Student.getBuilder();
//        build.setContent("Hi, welcome");
//      build.setRecipient("Aman");
//      build.setSender("Susmita");
//      build.setIsDelivered(true);
//      build.setTimestamp(12);

//      Student st = new Student(build);

//        v3
        Student s1 = Student.getBuilder().setContent("Hi, welcome")
      .setRecipient("man")
      .setSender("a")
      .setIsDelivered(true)
      .setTimestamp(12).build();
      System.out.println(s1.getContent());
    }
}
