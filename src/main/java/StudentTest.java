import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    @Before
    public void setup(){
        testingDude.addGrade(90);
        testingDude.addGrade(80);
    }

    public Student testingDude = new Student("Brance", 664);

    @Test
    public void testingIfAStudentIsMadeCorrectly(){
        assertEquals("Brance", testingDude.getName());
        assertEquals(664, testingDude.getId());
    }

    @Test
    public void testingGradeAverage(){
        assertEquals(85, testingDude.getGradeAverage());
    }

}
