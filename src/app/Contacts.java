package app;

import java.util.ArrayList;

public class Contacts {

    private String name;
    private String surname;
    private String phoneNumber;
    int n = 0;

    private ArrayList<Contacts> list;

    public Contacts(String name, String surname, String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.surname = surname;
        this.list = new ArrayList<Contacts>();

    }

    public String toString() {

        if (phoneNumber.isEmpty()) {

            return name + " " + surname + ", " + "[no number]";
        }

        return name + " " + surname + ", " + phoneNumber;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void hasNumber() {
        if (phoneNumber == null) {
            phoneNumber = "";

        }
    }

}
