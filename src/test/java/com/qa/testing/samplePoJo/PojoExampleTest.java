package com.qa.testing.samplePoJo;

import SampleTests.Hello;
import org.testng.annotations.Test;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import static javafx.beans.binding.Bindings.when;

public class PojoExampleTest {

    @Test
    public void testFindAuthorByUserIdTest() {
        PodamFactory factory = new PodamFactoryImpl();

        Hello hello = factory.manufacturePojo(Hello.class);
        System.out.println(hello.firstName);
        System.out.println(hello.lastName.toLowerCase());

    }
}
