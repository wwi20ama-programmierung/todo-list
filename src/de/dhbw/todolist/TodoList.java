package de.dhbw.todolist;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    public static void main(String[] args) {

        // Tags festlegen
        Tag freizeit = new Tag("Freizeit", Color.GREEN);
        Tag arbeit = new Tag("Arbeit");
        Tag jahresziele = new Tag("Jahresziele", Color.RED);

        // Eine Todo-Liste erzeugen.
        Liste l1 = new Liste();

        // Namen für die Liste vergeben.
        l1.setName("Wichtige Aufgaben");

        // Aufgaben hinzufügen.
        Aufgabe a1 = new Aufgabe();
        a1.setPriority(Priority.VERY_HIGH);
        a1.setDescription("Im Lotto gewinnen");
        a1.addTag(freizeit);
        a1.addTag(jahresziele);

        Aufgabe a2 = new Aufgabe();
        a2.setPriority(Priority.LOW);
        a2.setDescription("Dem Chef auf den Tisch ka...");
        a2.addTag(arbeit);

        Aufgabe a3 = new Aufgabe();
        a3.setPriority(Priority.VERY_HIGH);
        a3.setDescription("Geld ausgeben");
        a3.addTag(freizeit);

        Aufgabe a4 = new Aufgabe();
        a4.setPriority(Priority.VERY_LOW);
        a4.setDescription("Job suchen");
        a4.addTag(jahresziele);

        l1.addAufgabe(a1);
        l1.addAufgabe(a2);
        l1.addAufgabe(a3);
        l1.addAufgabe(a4);

        System.out.println(l1);

        l1.deleteAufgabe(a2);

        // Erwartung: Aufgabe 2 nicht mehr angezeigt
        System.out.println(l1);

        a4.setDone();

        // Erwartung: Aufgabe 4 ist erledigt
        System.out.println(l1);

        // Suchmethoden:
        l1.searchByDescription("Lotto"); // Erwartung: Referenz auf a1
        l1.searchByDescription("Universität"); // Erwartung: null

        l1.searchByTag(jahresziele); // Erwartung: Referenz auf a1
        l1.searchByTag(new Tag("Jahresziele", Color.RED)); // Erwartung: Referenz auf a1

        l1.searchByPriority(Priority.LOW); // Erwartung: Referenz auf a1
        l1.searchByPriority(Priority.MEDIUM); // Erwartung: null
    }
}
