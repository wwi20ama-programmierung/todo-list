package de.dhbw.todolist;

import java.time.LocalDateTime;

public class Aufgabe {
  private String description;
  private LocalDateTime todoUntil;
  private LocalDateTime doneTimestamp = null; // null bedeutet "nicht erledigt"

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public LocalDateTime getTodoUntil()
  {
    return todoUntil;
  }

  public void setTodoUntil(LocalDateTime datum)
  {
    todoUntil = datum;
  }

  public void setDone() {
    this.doneTimestamp = LocalDateTime.now();
  }

  public String toString()
  {
    return description;
  }
}
