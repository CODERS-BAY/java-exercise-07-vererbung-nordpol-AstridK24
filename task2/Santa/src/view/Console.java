package view;

import model.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);
    Presents presents = new Presents();
    Sledge sledge = new Sledge();
    Santa santa = new Santa();
    List<Child> children = new ArrayList<>();
    List<Elf> elves = new ArrayList<>();


    Warehouse warehouse = new Warehouse(100);

    public Console() {
        elves.add(new Elf("Buddy", "Verpacken", "Helfer"));
        elves.add(new Elf("Purzel", "Produktion", "Helfer"));
        elves.add(new Elf("Seppl", "Leitung", "Chef"));
    }

    public void dialog() {
        boolean end = false;
        while (!end) {
            System.out.println("Willkommen am Nordpol!");
            System.out.println("Wähle deine Nummer:");
            System.out.println("1...Santa");
            System.out.println("2...Elf");
            System.out.println("3...Kind");
            System.out.println("0...Beenden");
            System.out.println();

            int login = choice("Deine Auswahl:", List.of(0, 1, 2, 3));

            switch (login) {
                case 1:
                    System.out.println("Hallo Santa");
                    boolean endSanta = false;
                    while (!endSanta) {
                        System.out.println("Wähle deine Nummer:");
                        System.out.println("1...Geschenkeliste");
                        System.out.println("2...Kinder");
                        System.out.println("3...Schlitten");
                        System.out.println("0...Beenden");
                        System.out.println();

                        switch (choice("Deine Auswahl:", List.of(0, 1, 2, 3))) {
                            case 1: //Geschenkeliste
                                santa.list(presents, warehouse, sledge);
                                break;
                            case 2: //Kinder
                                System.out.print("Bite gib den Namen des Kindes ein: ");
                                String childName = scanner.next();
                                santa.getChildInfo(childName,children,presents,warehouse,sledge);

                                break;
                            case 3: //Schlitten
                                if (sledge.isFull()) {
                                    System.out.println("Der Schlitten ist voll, es kann losgehen!");
                                } else {
                                    System.out.println("Der Schlitten ist noch nicht bereit!");
                                }
                                break;
                            default:
                                endSanta = true;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Hallo Elf");
                    System.out.print("Bitte gib deinen Namen ein: ");
                    String elfname = scanner.next();
                    int found = -1;
                    for (int i = 0; i < elves.size(); i++) {
                        if (elves.get(i).getName().equals(elfname)) {
                            found = i;
                        }

                    }
                    if (found == -1) {
                        System.out.println("Du bist kein Elf!!!");
                    } else {
                        boolean endElf = false;
                        while (!endElf) {
                            Elf curElf = elves.get(found);
                            System.out.println("Hallo " + curElf.getName() + ", Abteilung: " + curElf.getDepartment() + ", Position: " + curElf.getPosition());

                            System.out.println("Wähle deine Aufgabe:");
                            System.out.println("1...Produzieren");
                            System.out.println("2...Lagerbestand");
                            System.out.println("3...Verladen");
                            System.out.println("4...Sortieren");
                            System.out.println("0...Beenden");
                            System.out.println();

                            switch (choice("Deine Auswahl:", List.of(0, 1, 2, 3, 4))) {
                                case 1:
                                    boolean endProduce = false;
                                    while (!endProduce) {
                                        System.out.println("Produzieren: ");
                                        List<Integer> availableChoices = presents.listAll();
                                        availableChoices.add(0);
                                        System.out.println("0...Beenden");
                                        System.out.println();
                                        int selection = choice("Deine Auswahl:", availableChoices);
                                        if (selection == 0) {
                                            endProduce = true;
                                        } else {
                                            if (curElf.produce(warehouse, presents, selection - 1)) {
                                                System.out.println("Geschenk wurde produziert.");
                                            } else {
                                                System.out.println("Geschenk konnte nicht produziert werden.");
                                            }
                                        }
                                    }
                                    break;
                                case 2:  //Lagerbestand
                                    warehouse.view();
                                    break;
                                case 3: //Verladen
                                    curElf.loadSledge(warehouse, sledge);
                                    break;
                                case 4: //Sortieren
                                    curElf.sortPresents(sledge);
                                    System.out.println("Die Geschenke wurden am Schlitten sortiert.");
                                    if (curElf.checkAll(presents, warehouse, sledge)) {
                                        System.out.println("Der Schlitten ist geladen!");
                                    }
                                    break;

                                default:
                                    endElf = true;
                                    break;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Hallo Kind");
                    System.out.print("Bitte gib deinen Namen ein: ");
                    String name = scanner.next();
                    System.out.print("Dein Alter: ");
                    int age = scanner.nextInt();
                    System.out.print("Und deinen Wohnort: ");
                    String city = scanner.next();
                    System.out.print("Was möchtest du zu Weihnachten bekommen: ");
                    String presentName = scanner.next();
                    System.out.println();
                    Child newChild = new Child(name, age, city);
                    children.add(newChild);
                    Present present = new Present(newChild, presentName);
                    presents.add(present);
                    break;
                default:
                    System.out.println("Schöne Weihnachen. Tschüss!");
                    end = true;
                    break;
            }
        }

    }

    private int choice(String text, List<Integer> availableChoices) {  //Auswahl
        int retVal = -1;
        //Scanner scanner = new Scanner(System.in);
        while (retVal == -1) {
            System.out.print(text);
            try {
                retVal = scanner.nextInt();
            }
            catch (InputMismatchException e){
                retVal = -1;
            }

            System.out.println();
            int found = -1;
            for (int i = 0; i < availableChoices.size(); i++) {
                if (availableChoices.get(i) == retVal) {
                    found = retVal;
                }
            }
            if (found < 0) {
                retVal = -1;
                System.out.println("Falsche Auswahl. Bitte versuche es nochmal.");
            }
        }
        return retVal;
    }
}
