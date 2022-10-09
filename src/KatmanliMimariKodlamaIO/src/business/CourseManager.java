package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Category;
import entities.Course;

import java.util.ArrayList;

public class CourseManager {
    CourseDao courseDao;
    private ArrayList<Course> courses;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, ArrayList<Course> courses, Logger[] loggers) {
        this.courseDao = courseDao;
        this.courses = courses;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        for (Course ct : courses) {
            if (ct.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Kurs ismi tekrar edemez!");
            }
        }
        if (course.getCoursePrice() < 0) {
            throw new Exception("Kursun fiyatı 0'dan küçük olamaz!");
        }
        courses.add(course);
        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }
    }
}
