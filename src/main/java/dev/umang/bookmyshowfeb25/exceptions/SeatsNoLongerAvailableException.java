package dev.umang.bookmyshowfeb25.exceptions;

public class SeatsNoLongerAvailableException extends RuntimeException{
    public SeatsNoLongerAvailableException(String message){
        super(message);
    }
}
