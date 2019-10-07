package app;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Menu
 */
public class Menu {

    private Scanner sc;
    private String menuChoice;
    // n is the counter for counting in the Contacts list
    private int n;

    private String name;
    private String surname;
    private String phoneNumber;

    private ArrayList<Contacts> list;

    /**
     * constructor
     */
    public Menu() {
        sc = new Scanner(System.in);
        menuChoice = "";
        list = new ArrayList<Contacts>();
        n = 0;

    }

    // START
    public void start() {

        while (!menuChoice.contains("exit")) {

            System.out.print("Enter action (add, remove, edit, count, list, exit): ");
            menuChoice = sc.next();
            sc.nextLine();

            switch (menuChoice) {
            case "add":
                add();

                break;

            case "remove":
                remove();

                break;
            case "edit":
                edit();

                break;
            case "count":
                count();

                break;
            case "list":
                list();

                break;

            default:
                break;
            }

        }

    }

    // COUNT
    public void count() {
        if (list.isEmpty()) {
            System.out.println("The Phone Book has 0 records.");

        }
    }

    // ADD
    public void add() {
        // ask user
        System.out.print("Enter the name: ");
        name = sc.nextLine();

        System.out.print("Enter the surname: ");
        surname = sc.nextLine();

        System.out.print("Enter the number: ");
        phoneNumber = sc.nextLine();

        // create New user
        Contacts newUser = new Contacts(name, surname, phoneNumber);

        // add user
        list.add(newUser);
        // print
        System.out.println("The record added");

    }

    // EDIT
    public void edit() {

        listToRemove();

        System.out.print("Select a record: ");

        int userNumber = sc.nextInt();

        if (list.isEmpty()) {
            System.out.println("No records to edit!");

        } else if (userNumber == n) {
            editField();

        }
        resetCount();
        return;
    }

    // REMOVE
    public void remove() {

        listToRemove();

        System.out.print("Select a record: ");

        int userNumber = sc.nextInt();

        if (list.isEmpty()) {
            System.out.println("No records to remove");
            resetCount();
        }

        else if (userNumber == n) {

            list.remove(userNumber - userNumber);
            System.out.println("The record removed");
            resetCount();

        }
        resetCount();
        return;
    }

    // LIST
    public void list() {

        for (Contacts x : list) {
            countN();

            System.out.println(n + ". " + x.toString());

        }

    }

    public int countN() {
        n++;

        return n;

    }

    public void resetCount() {
        n = 0;

    }

    public void listToRemove() {

        for (Contacts x : list) {
            countN();

            System.out.println(n + ". " + x.toString());

        }

    }

    public void editField() {
        String user = "";
        while (true) {

            System.out.print("Select a field (name, surname, number): ");
            user = sc.next();
            sc.nextLine();

            switch (user) {
            case "name":

                Contacts a = list.get(n - 1);
                System.out.print("Enter name: ");
                name = sc.nextLine();
                a.setName(name);
                System.out.println("The record updated!");
                resetCount();
                return;

            case "surname":
                Contacts b = list.get(n - 1);
                System.out.print("Enter surname: ");
                surname = sc.nextLine();
                b.setSurname(surname);
                System.out.println("The record updated!");
                resetCount();

                return;
            case "number":
                Contacts c = list.get(n - 1);
                System.out.print("Enter number: ");
                phoneNumber = sc.nextLine();
                c.setPhoneNumber(phoneNumber);
                System.out.println("The record updated!");
                resetCount();

                return;

            default:
                resetCount();
                break;
            }
        }

    }
}
