
package Exceptions;

public class DocumentException extends Exception{
    
    private String message;

    public DocumentException() {
        this.message = "Documento invalido";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
