package exception;

import java.util.List;

public interface FoolService {
    /**
     * 该方法抛出checked Exception
     * @param throwException 是否抛出异常
     * @param names
     * @throws FooException
     */
    void insertThrowCheckedException(Boolean throwException,String... names) throws FooException;

    /**
     * 该方法抛出Unchecked Exception
     * @param throwException 是否抛出异常
     * @param names
     * @throws FooException
     */
    void insertThrowUnCheckedException(Boolean throwException,String... names) throws FooRuntimeException;

    List<String> getAll();

    void deleteAll();
}
