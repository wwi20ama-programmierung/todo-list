package de.dhbw.todolist;

import java.util.ArrayList;

public class Benutzer {
  private String name;
  private ArrayList<Liste> listen;

  public void setName(String name)
  {
    this.name = name;
  }

  public void setList(Liste liste)
  {
    listen.add(liste);
  }
}
