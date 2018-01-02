package exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class FoolServiceImpl implements FoolService {
    private final static Logger LOGGER = LoggerFactory.getLogger(FoolServiceImpl.class);

    private final JdbcTemplate jdbcTemplate;

    public FoolServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    @Override
    public void insertThrowCheckedException(Boolean throwException, String... names) throws FooException {
        for(String name:names){
            LOGGER.info("insert foo ["+name+"]");
            jdbcTemplate.update("insert into FOO(NAME) VALUES (?)",name);
        }
        if (throwException){
            throw new FooException();
        }
    }

    public void insertThrowUnCheckedException(Boolean throwException, String... names) throws FooRuntimeException {
        for (String name : names) {
            LOGGER.info("Insert Foo[" + name + "]");
            jdbcTemplate.update("insert into FOO(NAME) values (?)", name);
        }

        if (throwException) {
            throw new FooRuntimeException();
        }
    }

    public List<String> getAll() {
        return jdbcTemplate.query("select NAME from FOO",(rs,rowNum)->rs.getString("NAME"));
    }

    public void deleteAll() {
        jdbcTemplate.update("delete from FOO");
    }
}
