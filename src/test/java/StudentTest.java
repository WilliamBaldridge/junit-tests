import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    private long id;
    private String name;
    private ArrayList<Integer> grades;


    @Before
    public void getId() {
        this.id = 0;

    }

    @Test
    public void getId_GivenEmptyId_ReturnNeededInput() {

        long expectedInputId = 1;
        long inputId = 0;


        assertEquals(expectedInputId, inputId);

    }

//    @Test
//    public void getId_GivenWrongFormat_ReturnFormatException() {
//
//        long inputId = 1.0;
//
//    }



}
