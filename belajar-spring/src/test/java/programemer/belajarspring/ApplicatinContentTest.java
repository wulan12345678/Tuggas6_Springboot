package programemer.belajarspring;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicatinContentTest {

    @Test
    void testApplicationContenttext(){

        ApplicationContext context = new AnnotationConfigApplicationContext(HelloworldConnfiguration.class);
        Assertions.assertNotNull(context);
    }
}
