
package Exceptions;

public class DocumentException extends Exception{
    
    private String message;

    public DocumentException() {
        this.message = "\nNo puedees regisrarte porque eres menor de edad";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
