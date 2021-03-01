package de.dhbw.todolist;

public class TodoList {

    public static void main(String[] args) {
      
      // Eine Todo-Liste erzeugen.
      Liste l1 = new Liste();

      // Namen für die Liste vergeben.
      l1.setName("Wichtige Aufgaben");

      // Aufgaben hinzufügen.
      Aufgabe a1 = new Aufgabe();
      a1.setDescription("Im Lotto gewinnen");

      Aufgabe a2 = new Aufgabe();
      a2.setDescription("Dem Chef auf den Tisch ka...");

      Aufgabe a3 = new Aufgabe();
      a3.setDescription("Geld ausgeben");

      Aufgabe a4 = new Aufgabe();
      a4.setDescription("Job suchen");
      
      l1.addAufgabe(a1);
      l1.addAufgabe(a2);
      l1.addAufgabe(a3);
      l1.addAufgabe(a4);

      System.out.println(l1);
    }
}
