package de.dhbw;

import java.time.LocalDateTime;

public class Aufgabe {
  private String description;
  private LocalDateTime todoUntil;

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
}
