package OOPS;

public class Course implements Cloneable {
    private String name;

    @Override
    public Course clone() throws CloneNotSupportedException {
        return (Course) super.clone();
    }

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
