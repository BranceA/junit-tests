import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {

    private Cohort testCohort;


    @Before
    public void setUp(){
        testCohort = new Cohort();
        Student dani = new Student(725, "Dani");
        dani.addGrade(92);
        dani.addGrade(88);
        dani.addGrade(54);
        Student beverly = new Student(8731, "Beverly");
        beverly.addGrade(70);
        beverly.addGrade(100);
        beverly.addGrade(93);
        Student alex = new Student(534, "Alex");
        alex.addGrade(20);
        alex.addGrade(69);
        alex.addGrade(17);
        testCohort.addStudent(dani);
        testCohort.addStudent(beverly);
        testCohort.addStudent(alex);
    }

    @Test
    public void testIfCanAddStudentsToCohort(){
        Student brance = new Student(664, "Brance");
        Student mitch = new Student(234, "Mitch");
        Student mark = new Student(876, "Mark");
        testCohort.addStudent(brance);
        testCohort.addStudent(mitch);
        testCohort.addStudent(mark);

        assertEquals("Brance" , testCohort.getStudents().get(3).getName());
    }

    @Test
    public void testIfCohortCanGetCurrentListOfStudents(){
        assertNotNull(testCohort.getStudents());
        assertEquals(3, testCohort.getStudents().size());
    }

    @Test
    public void testIfCohortReturnsCorrectGradeAverage(){
        assertEquals(67, testCohort.getCohortAverage(), 2);
    }

}
