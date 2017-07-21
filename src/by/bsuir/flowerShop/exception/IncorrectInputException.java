package by.bsuir.flowerShop.exception;


import java.io.IOException;

public class IncorrectInputException extends IOException {

    private double first;
    private double second;

    public IncorrectInputException(String message){
        super(message);
    }

    public IncorrectInputException(String message, double first){
        super(message);
        this.first = first;
    }

    public IncorrectInputException(String message, double first, int second){
        super(message);
        this.first = first;
        this.second = second;
    }

    public IncorrectInputException(String message, int min, int max){
        super(message);
        this.first = min;
        this.second = max;
    }

    public double getFirstNumber() {
        return this.first;
    }
    public double getSecondNumber() {
        return this.second;
    }
}
