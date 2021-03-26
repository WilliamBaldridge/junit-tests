import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.awt.*;
import java.util.ArrayList;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    Student will;
    Student bob;
    String casper;

    @BeforeEach
    public void setup() {

        will = new Student(1L, "William");
        bob = new Student(2L, "Bob");
        casper = null;


        will.addGrade(99);
        will.addGrade(90);
        bob.addGrade(68);

    }

    @Test
    @DisplayName("testStudentConstructor")
    void testStudentConstructor() {

        assertNull(casper);
        assertNotNull(will);

//        fail("Not implemented");
    }

    @Test
    @DisplayName("test StudentGetters")
    void test_StudentGetters() {

        assertAll(() -> assertSame(1L, will.getId()),
                () -> assertSame("William", will.getName()),
                () -> assertSame(2, will.getGrades().size())
        );

//        fail("Not implemented");
    }

    @Test
    @DisplayName("test AddGrade")
    void test_AddGrade() {

        assertAll(() -> assertSame(99, will.getGrades().get(0)),
                () -> assertSame(90, will.getGrades().get(1))
        );

//        fail("Not implemented");
    }

    @Test
    @DisplayName("test AverageGrade")
    void test_AverageGrade() {

        assertEquals(95, will.getGradeAverage(), 0.5);

    }





}
