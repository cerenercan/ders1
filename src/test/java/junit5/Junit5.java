package junit5;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class Junit5 extends Junit5Base {

    //@Test --> ParameterizedTest annotation'ını eklediğimiz için @Test'e gerek kalmıyor.
    @ParameterizedTest
    @ValueSource(strings = {"kullanıcı1", "kullanıcı2", "kullanıcı3", "kullanıcı4"})
    //@ValueSource(ints = {1, 2, 3, 4, 5} --> int için bu syntax kullanılıyor.
    public void test1(String arg){
        System.out.println("Test 1 with parameters");
        System.out.println("Parameter: " + arg);
        System.out.println(arg + " login oldu.");
    }

    @Test
    @DisplayName("Display Name")
    //@Disabled("Bakım gerekiyor") --> Testi pas geçiyor.
    public void test2(){
        System.out.println("Test 2");
    }

    @Test
    public void test3(){
        System.out.println("Test 3");
    }


}
