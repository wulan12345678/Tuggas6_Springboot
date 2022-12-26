package programemer.belajarspring;

import Data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateTest {

    @SuppressWarnings("UnnecessaryCodeBlock")
    @Test
    void testDuplicate(){

        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () {
            Foo foo   = context.getBean(Foo.class);

        });

    }
    @Test
    void getBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("Foo2", Foo.class);

        Assertions.assertSame(foo1, foo2);
    }
}
