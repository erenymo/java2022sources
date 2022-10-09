package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName()+ " "+ instructor.getLastName() + " adlı eğitmen Hibernate ile veritabanına eklendi!");
    }
}
