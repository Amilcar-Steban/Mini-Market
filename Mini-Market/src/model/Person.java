
package model;

public class Person {
    
    private String id;
    private byte num;
    
    public Person(byte num,String id ) {
        this.id = id;
        this.num = num;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public TypeIdEnum getNum() {
        
        TypeIdEnum tipeId = null;
        
        switch (num) {
                case 2:
                    tipeId = TypeIdEnum.CC;
                    
                case 3:
                    tipeId = TypeIdEnum.PP;
                    
                case 4:
                    tipeId = TypeIdEnum.CE;
        }
        return tipeId;
    }

    public void setNum(byte num){
        this.num = num;
    }

    public String toString() {
    
        return "Tipo de identipicacion: "+ getNum() +"\nNumero de identificacion: "+ id+ "\n";
    }
    
 
}
