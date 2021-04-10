
package model;
import Exceptions.DocumentException;

public class Person {
    
    private String id;
    private byte num;
    
    public Person(String id, byte num) {
        this.id = id;
        this.num = num;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte getNum() {
        return num;
    }

    public void setNum(byte num) throws  DocumentException{
        if (num == 0) {
            throw new DocumentException();
        }
        this.num = num;
    }
    
    
    
}
