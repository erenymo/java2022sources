package entities;

public class Course {
    private String courseName;
    private double coursePrice;
    private Instructor instructor;
    private Category category;

    public Course() {
    }

    public Course(String courseName, double coursePrice, Instructor instructor, Category category) {
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.instructor = instructor;
        this.category = category;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
