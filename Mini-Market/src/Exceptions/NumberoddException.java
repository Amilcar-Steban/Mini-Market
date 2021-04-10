
package Exceptions;

public class NumberoddException extends Exception{
    
    private String message;
    
    public NumberoddException() {
        this.message = "No tiene permitido ingresar porque su numero de identidad y dia no se lo permite";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
