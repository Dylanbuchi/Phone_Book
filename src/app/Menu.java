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
            menuChoice = sc.nextLine();

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
        if (list.isEmpty()) {
            System.out.println("No records to edit!");

        } else if (condition) {

        }
    }

    // REMOVE
    public void remove() {

        n = 0;
        list();

        System.out.print("Select a record: ");

        int userNumber = sc.nextInt();

        if (list.isEmpty()) {
            System.out.println("No records to remove");

        }

        else if (userNumber == n) {

            list.remove(n - 1);
            resetCount();

        }
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

}
