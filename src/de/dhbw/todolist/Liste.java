package de.dhbw.todolist;

import java.util.ArrayList;

public class Liste {
    private String name;
    private ArrayList<Aufgabe> tasks;

    public Liste() {
        tasks = new ArrayList<Aufgabe>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Aufgabe> getTasks() {
        return tasks;
    }

    public void addAufgabe(Aufgabe aufgabe) {
        tasks.add(aufgabe);
    }

    public void deleteAufgabe(Aufgabe aufgabe) {
        tasks.remove(aufgabe);
    }

    /**
     * Gibt ein Aufgabe-Objekt zurück, wenn der String "such" ein Teil der Aufgabenbeschreibung ist,
     * ansonsten "null".
     *
     * @param such
     * @return
     */
    public Aufgabe searchByDescription(String such) {
        for (int i = 0; i < this.tasks.size(); i++) {
            Aufgabe aufgabe = this.tasks.get(i);

            if (aufgabe.getDescription().contains(such)) {
                return aufgabe;
            }
        }
        return null;
    }

    /**
     * Gibt den Index der Aufgabe in der "tasks"-Liste zurück, wenn der String "such" ein Teil der
     * Aufgabenbeschreibung ist, ansonsten -1.
     *
     * @param such
     * @return
     */
    public int searchByDescriptionAndReturnIndex(String such) {
        for (int i = 0; i < this.tasks.size(); i++) {
            Aufgabe aufgabe = this.tasks.get(i);

            if (aufgabe.getDescription().contains(such)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Gibt ein Aufgabe-Objekt zurück, wenn der Tag "tag" der Aufgabe zugeordnet ist,
     * ansonsten "null".
     *
     * @param tag
     * @return
     */
    public Aufgabe searchByTag(Tag tag) {
        return null;
    }

    /**
     * Gibt ein Aufgabe-Objekt zurück, wenn die Aufgabe die Priorität "priority" besitzt,
     * ansonsten "null".
     *
     * @param priority
     * @return
     */
    public Aufgabe searchByPriority(Priority priority) {
        return null;
    }

    public String toString() {
        String ergebnis = name + "\n";
        for (Aufgabe task : tasks) {
            ergebnis += "  ";
            ergebnis += task.toString();
            ergebnis += "\n";
        }
        return ergebnis;
    }
}
