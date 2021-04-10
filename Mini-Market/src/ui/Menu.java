
package ui;
import java.util.Scanner;
import model.*;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Scanner cs = new Scanner(System.in);
    
    public byte tipeDocument(){
        
        byte num = -1;
        System.out.println("\n\tREGISTRO"
                           +"\nIngrese el tipo de Identificación:"
                           +"\n1.Tarjeta de identidad"
                           +"\n2.Cedula de ciudadania"
                           +"\n3.Pasaporte"
                           +"\n4.Cedula extrangera");
        num = sc.nextByte(-1);

        return num;
    }
    public String numberDocument(){
        
        String numberDocument;
        System.out.println("\nIngrese el numero de identificación");
        numberDocument = cs.nextLine();
        return numberDocument;
        
    }
    
    public void menuOptions(){
        byte option = 0;
        
        while(option != 3){
            
        System.out.println("\n\tMENU"
                           +"\n1.Registrarse"
                           +"\n2.Mostrar cantidad de personas que han intentado ingresar"
                           +"\n3.Salir");
        option = sc.nextByte();

        }
        
        switch (option) {
                case 1:
                    tipeDocument();
                    break;
                case 2:
                    int cont = 0;
                    if (option == 1) {
                        cont += 1;
                        System.out.println(": "+cont);
                        
                    }
                    System.out.println("");
                    break;
                case 3:

                    break;
        }
    
    }
}
