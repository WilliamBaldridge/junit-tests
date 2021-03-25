import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.testng.ITest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.fail;

public class StudentTest {

    private long id;
    private String name;
    private ArrayList<Integer> grades;


    @Before
    public void getId() {
        this.id = 0L;

    }

    @Test
    public void getId_GivenEmptyId_ReturnNeededInput() {

        long expectedInputId = 1L;
        long inputId = 0L;


        assertEquals(expectedInputId, inputId);

    }


    @Test
    @DisplayName("Ah Ioient Have ")
    void Ah_Ioient_Have_() {
        
        org.junit.jupiter.api.Assertions.fail("Not implemented");
    }





//    @Test
//    public void getId_GivenWrongFormat_ReturnFormatException() {
//
//        long inputId = 1.0;
//
//    }



}
