package Exception;

import exception.FoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * 1. 当抛出unchecked exceptions的时候，transaction会自动回滚
 * 2,当抛出checked exceptions的时候，transaction不会自动回滚
 */
@SpringBootTest
@SpringBootApplication(exclude = FlywayAutoConfiguration.class)
public class ExceptionRollbackTest extends AbstractTestNGSpringContextTests{

    //@Autowired
   // private FoolService foolService;

}
