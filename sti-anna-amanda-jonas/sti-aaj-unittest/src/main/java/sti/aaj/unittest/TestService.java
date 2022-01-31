package sti.aaj.unittest;



import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import sti.aaj.service.StiService;

import java.util.List;

public class TestService {

    private static final String JONAS_WADIN = "Jonas Wadin";

    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:Sti-aaj-service-impl.xml");

    @Test
    public void testSpringWiring(){
        StiService stiService = (StiService)applicationContext.getBean("service");
        List<String> students = stiService.getStudents();
        Assert.assertEquals(JONAS_WADIN, students.get(0));
    }
}