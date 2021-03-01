package de.dhbw.todolist;

import java.util.ArrayList;

public class Liste {
  private String name;
  private Benutzer owner;
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
}
