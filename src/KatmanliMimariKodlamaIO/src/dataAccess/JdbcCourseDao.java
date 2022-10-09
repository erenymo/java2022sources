package dataAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " adlı kurs JDBC ile sisteme eklendi!");
    }
}
