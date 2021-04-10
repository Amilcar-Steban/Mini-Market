
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
    
    public byte tipeDocument(){
        
        byte num = 0;
        System.out.println("\n\tREGISTRO"
                           +"\nIngrese el tipo de Identificación:"
                           +"\n1.Tarjeta de identidad"
                           +"\n2.Cedula de ciudadania"
                           +"\n3.Pasaporte"
                           +"\n4.Cedula extrangera");
        
        num = sc.nextByte();
        
        

        return num;
    }
    public String numberDocument(){
        
        String numberDocument;
        System.out.println("\nIngrese el numero de identificación: ");
        numberDocument = cs.next();
        
        return numberDocument;
        
    }
    
    public void menuOptions(){
        byte option = 0;
        int cont = 0;
        while(option != 3){
            
        System.out.println("\n\tMENU"
                           +"\n1.Registrarse"
                           +"\n2.Mostrar cantidad de personas que han intentado ingresar"
                           +"\n3.Salir");
        
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
                        throw new Exception("Ingrese un numero valido, tiene que tener mas de dos digitos");
                    }
                    break;
                    
                }else if(option == 2){
                            System.out.println(": "+cont);
                        
                }else if(option ==3) {
                    break;
                }

                
            } catch (DocumentException e) {
                System.out.println(e.getMessage());
            } catch (NumberoddException e) {
                System.out.println(e.getMessage());
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        
    
    }
}
