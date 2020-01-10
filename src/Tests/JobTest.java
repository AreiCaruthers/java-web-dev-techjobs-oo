package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
   Job testJob1;
   Job testJob2;

    @Before
    public void createJobObjects() {
        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testToString() {
        assertEquals("ID: 1" + "\n" + "Name: Product tester" + "\n" + "Employer: ACME" + "\n" + "Location: Desert" + "\n" + "Position Type: Quality control" + "\n" + "Core Competency: Persistence" + "\n", testJob1.toString());
    }


    @Test
    public void testSettingJobId() {
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job.getEmployer() instanceof Employer);
        assertTrue(test_job.getLocation() instanceof Location);
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality() {
        assertNotEquals(testJob1,testJob2);
    }



}
