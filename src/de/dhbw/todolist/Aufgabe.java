package de.dhbw.todolist;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe {
  private String description;
  private LocalDateTime todoUntil;
  private Priority priority;
  private LocalDateTime doneTimestamp = null; // null bedeutet "nicht erledigt"
  private List<Tag> tags = new ArrayList<>();

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

  public Priority getPriority() {
    return this.priority;
  }

  public void setPriority(Priority priority) {
    this.priority = priority;
  }

  public boolean isDone() {
    return this.doneTimestamp != null;
  }

  public void setDone() {
    this.doneTimestamp = LocalDateTime.now();
  }

  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public void addTag(Tag tag) {
    this.tags.add(tag);
  }

  public String toString()
  {
    // Beschreibung: Priorität (2 Tags, erledigt true/false)
    return description + ": " + priority + " (" + tags.size() + " Tags, erledigt: " + isDone() + ")";
  }
}
