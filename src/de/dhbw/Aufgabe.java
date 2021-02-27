package de.dhbw;

public class Aufgabe {
  private String description;
  private Datum todoUntil;

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public Datum getTodoUntil()
  {
    return todoUntil;
  }

  public void setTodoUntil(Datum datum)
  {
    todoUntil = datum;
  }
}
