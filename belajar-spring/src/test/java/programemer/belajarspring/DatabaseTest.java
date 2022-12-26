package programemer.belajarspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    void  testSingeleton(){

        var database1 = 0;Database Database = programemer.belajarspring.Database.getInstance();
        var database2 = 0;Database = programemer.belajarspring.Database.getInstance();

        Assertions.assertSame(database1 , database2);
    }
}