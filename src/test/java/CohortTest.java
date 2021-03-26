import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.jupiter.api.AssertEquals.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertSame;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;


    @BeforeEach // JUnit 4 is @Before to run before each @Test
    public void setup() {

        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student will = new Student(1L, "William Baldridge");
        will.addGrade(90);
        will.addGrade(90);
        will.addGrade(90);

        Student jim = new Student(2L, "Jim Bob");
        jim.addGrade(100);

        cohortWithOne.addStudent(will);
        cohortWithMany.addStudent(will);
        cohortWithMany.addStudent(jim);

    }

    @Test
    @DisplayName("addStudent GivenValidStudent StudentIsAdded")
    void addStudent_GivenValidStudent_StudentIsAdded() {

        Student casey = new Student(12L, "Casey");

        cohortWithMany.addStudent(casey);


        Assertions.assertAll(() -> assertSame(casey, cohortWithMany.getStudents().get(2)),
                () -> assertEquals(3, cohortWithMany.getStudents().size()),
                () -> assertEquals("Casey", cohortWithMany.getStudents().get(2).getName()));

    }

    @Test
    @DisplayName("getStudents TestIfWorks")
    void getStudents_TestIfWorks() {

        assertAll(() -> assertEquals(0, emptyCohort.getStudents().size()),
                () -> assertEquals(1, cohortWithOne.getStudents().size()),
                () -> assertEquals(1, cohortWithMany.getStudents().get(0).getId()),
                () -> assertEquals(2, cohortWithMany.getStudents().get(1).getId())
        );

    }

    @Test
    @DisplayName("getCohortAverage GivenValidGrades CanReturnCorrectAverage")
    void getCohortAverage_GivenValidGrades_CanReturnCorrectAverage() {

        assertAll(() -> assertEquals(Double.NaN, emptyCohort.getCohortAverage(), 0),
                () -> assertEquals(90.0, cohortWithOne.getCohortAverage(), 0),
                () -> assertEquals(95.0, cohortWithMany.getCohortAverage(), 0)
        );

    }


}
