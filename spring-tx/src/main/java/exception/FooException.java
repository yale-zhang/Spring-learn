package exception;

public class FooException extends Exception {

    public FooException(){
        super();
    }
    public FooException(String message){
        super(message);
    }

    public FooException(Throwable cause){
        super(cause);
    }

    public FooException(String message,Throwable cause){
        super(message,cause);
    }

    protected FooException(String message,Throwable cause,boolean enableSuppression,boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
