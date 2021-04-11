
package ui;
import Exceptions.DocumentException;
import Exceptions.NumberoddException;
import java.util.ArrayList;
import java.util.Scanner;
import model.Person;
import model.MiniMarket;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Scanner cs = new Scanner(System.in);
    ArrayList<Person> persons;
    MiniMarket m = new MiniMarket();

    public Menu() {
        persons = new ArrayList<>();
    }
    
    public byte tipeDocument() throws DocumentException{
        
        byte num = 0;
        System.out.print("\n\tREGISTRO"
                           +"\n\nIngrese el tipo de Identificación:"
                           +"\n1.Tarjeta de identidad"
                           +"\n2.Cedula de ciudadania"
                           +"\n3.Pasaporte"
                           +"\n4.Cedula extrangera"
                           +"\n\nOpcion: ");
        
        
        
        num = sc.nextByte();
        m.idType(num);
        

        return num;
    }
    public String numberDocument() throws Exception{
        
        String numberDocument;
        System.out.println("\nIngrese el numero de identificación: ");
        numberDocument = cs.next();
        
        m.id(numberDocument);

        
        return numberDocument;
        
    }
    
    public void menuOptions(){
        byte option = 0;
        int cont = 0;
        while(option != 3){
            
        System.out.print("\n\tMENU"
                           +"\n\n1.Registrarse"
                           +"\n2.Mostrar cantidad de personas que han intentado ingresar"
                           +"\n3.Salir"
                           +"\n\nOpcion: ");
        
        option = sc.nextByte();
        
            if (option == 1) {
                cont += 1;
            }
        
            try {
                if (option == 1) {
                    
                    byte tipe = tipeDocument();
                    String number = numberDocument();
                    boolean person = m.addPerson(tipe, number);
                    
                    
                    
                    if (person == false) {
                        throw new Exception("Ingrese un numero valido");
                    }
                    break;
                    
                }else if(option == 2){
                            System.out.println("\nNumero de personas que intentaron ingresar: "+cont);
                        
                }else if(option ==3) {
                    break;
                }

                
            } catch (DocumentException e) {
                System.out.println(e.getMessage());
                
            } catch (NumberoddException i) {
                System.out.println(i.getMessage());
                
            }catch (Exception o) {
                System.out.println(o.getMessage());
            }
        }
        
        
    
    }
}
