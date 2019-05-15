package lesson3;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {

       PhBook phBook = new PhBook();

        phBook.add("Petrov", "89261111111");
        phBook.add("Ivanov", "89262222222");
        phBook.add("Sidorov", "89263333333");
        phBook.add("Sokolov", "89264444444");
        phBook.add("Petrov", "89265555555");
        phBook.add("Ivanov", "89266666666");
        phBook.add("Sidorov", "89267777777");
        phBook.add("Petrov", "89268888888");
        phBook.add("Sidorov", "89269999999");

            phBook.getNumberBySurname("Ivanov");
            phBook.getNumberBySurname("Sidorov");
            phBook.getNumberBySurname("Sokolov");
            phBook.getNumberBySurname("Solov");
    }
}

class PhBook {

    private String surname;
    private String phoneNumber;

    public PhBook(String surname, String phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public PhBook() {
    }

    public String getSurname() {
        return surname;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    private Map<String, List<String>> pb = new HashMap<>();
    private List<String> list_phoneNumber;

    public void add (String surname, String phoneNumber) {
        if (pb.containsKey(surname)) {
            list_phoneNumber = pb.get(surname);
            list_phoneNumber.add(phoneNumber);
            pb.put(surname, list_phoneNumber);
        }
        else {
            list_phoneNumber = new ArrayList<>();
            list_phoneNumber.add(phoneNumber);
            pb.put(surname, list_phoneNumber);
        }
    }

    public void getNumberBySurname (String surname){
        if(pb.containsKey(surname)) {
            System.out.println(surname + "-" + pb.get(surname));
        }
        else System.out.println(surname + " - Такой фамилии нет в справочнике");
    }
}

