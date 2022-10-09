import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger()};

        // Eğitmenin Sisteme eklenmesi
        Instructor instructor1 = new Instructor("Engin","Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor1);

        // Kategorinin Sisteme eklenmesi
        ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(new Category("Algoritma"));
        Category category1 = new Category("Programlama");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),categories, loggers);
        categoryManager.add(category1);

        // Kursun Sisteme eklenmesi
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(new Course("Senior Yazılım Geliştirici Yetiştirme Kampı", 0, instructor1, category1));
        Course course1 = new Course("(2022)Yazılım Geliştirici Yetiştirme Kampı - JAVA", 0, instructor1, category1);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), courses, loggers);
        courseManager.add(course1);
    }
}