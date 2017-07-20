package by.bsuir.flowerShop.exception;


import java.io.IOException;

public class IncorrectInputException extends IOException {
    public IncorrectInputException(String message){
        super(message);
    }
    public IncorrectInputException(String message, String accessory, int cost){
        super(message);
    }
}
