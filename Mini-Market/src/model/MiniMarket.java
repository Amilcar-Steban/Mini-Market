package model;

import Exceptions.DocumentException;
import Exceptions.NumberoddException;
import java.time.LocalDate;
import java.util.ArrayList;

public class MiniMarket {

    public ArrayList<Person> person;

    public MiniMarket() {
        this.person = new ArrayList<Person>();
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    public TypeIdEnum idType(byte type) throws DocumentException {

        TypeIdEnum tipeId = null;
        switch (type) {
            case 0:
                throw new DocumentException();

            case 2:
                tipeId = TypeIdEnum.CC;

            case 3:
                tipeId = TypeIdEnum.PP;

            case 4:
                tipeId = TypeIdEnum.CE;
        }
        return tipeId;

    }

    public void id(String num) throws Exception, NumberoddException {

        if (num.length() < 2) {
            throw new Exception("El numero debe contener mas de dos cifras");
        }

        int cont = -1;
        int penultNmuber = 0;

        char[] numberD = num.toCharArray();
        for (int i = 0; i < numberD.length; i++) {
            cont = numberD[i - 1];
        }

        if (cont % 2 == 0) {
            throw new NumberoddException();

        } else if (LocalDate.now().getDayOfMonth() % 2 == 0) {
            throw new NumberoddException();

        }

    }

    public boolean addPerson(byte tipeId, String numId) throws DocumentException, Exception, NumberoddException {

        TypeIdEnum id = idType(tipeId);

        if (id == null) {
            return false;

        }
        id(numId);
        person.add(new Person(tipeId, numId));

        return true;
    }

    public void showInfo() {
        if (person.isEmpty()) {
            System.out.println("Por el momento la lista de clientes esta vacia");
        } else {
            System.out.println("\tCLIENTES:");
            for (int i = 0; i < person.size(); i++) {
                System.out.println(i + 1 + ". " + person.get(i));
                System.out.println("-------------------------------------------------------------");
            }
        }
    }

}
