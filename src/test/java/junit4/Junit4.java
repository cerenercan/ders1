package junit4;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Junit4 extends Junit4Base {

    String getUserName(){
        return "Kullanıcı1";
    }

    @Test
    public void test1(){
        String userName = getUserName();
        Assert.assertEquals("Bu test fail oldu", "Kullanıcı1" ,userName);
        System.out.println("Test 1");
    }

    @Test
    public void testArrayEquals(){
        String[] arr1 = {"Testinium", "QA", "Test"};
        String[] arr2 = {"Testinium", "Test", "QA"};
        //Arrays.sort(arr1);
        //Arrays.sort(arr2);

        //assertArrayEquals arkada kendisi sortluyor.
        Assert.assertArrayEquals("Bu Fail oldu",arr1, arr2);
    }

    @Test
    //@Ignore("Gereksiz")
    public void test2(){
        System.out.println("Test 2");
    }

    @Test
    public void test3(){
        System.out.println("Test 3");
    }

    @Test
    public void sample(){
        Assert.assertEquals("Hata mesajı -> Assert Equals", "Testinium", "Testinium");
        Assert.assertNotEquals("Hata mesajı -> Assert Not Equals", "Testinium", "Testinium QA");
        Assert.assertTrue("Hata mesajı -> Assert True", 1 == 1 && 1 > 0);
        //assertFalse -> Condition true olursa hata mesajı çıkar. Eğer condition false dönüyorsa assert olmaz.
        Assert.assertFalse("Hata mesajı -> Assert False", 1 == 1 && 1 > 0);
    }
}
