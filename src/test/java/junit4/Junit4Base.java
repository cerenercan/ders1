package junit4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Junit4Base {

    @BeforeClass
    public static void beforeClass(){
       // System.out.println("Before Class");
    }

    @Before
    public void before(){
       // System.out.println("Before");
    }

    @After
    public void after(){
       // System.out.println("After");
    }

    @AfterClass
    public static void afterClass(){
        //System.out.println("After Class");
    }

}
