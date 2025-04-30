package dev.umang.bookmyshowfeb25.exceptions;

public class ShowNotFoundException extends RuntimeException{
    public ShowNotFoundException(String message){
        super(message);
    }
}
