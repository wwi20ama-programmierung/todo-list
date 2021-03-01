package de.dhbw.todolist;

import java.util.ArrayList;

public class Liste {
  private String name;
  private ArrayList<Aufgabe> tasks;

  public Liste()
  {
    tasks = new ArrayList<Aufgabe>();
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public ArrayList<Aufgabe> getTasks()
  {
    return tasks;
  }

  public void addAufgabe(Aufgabe aufgabe)
  {
    tasks.add(aufgabe);
  }

  public String toString()
  {
    String ergebnis = name + "\n";
    for (Aufgabe task : tasks)
    {
      ergebnis += "  ";
      ergebnis += task.toString();
      ergebnis += "\n";
    }
    return ergebnis;
  }
}
