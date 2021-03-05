package de.dhbw.todolist;

public class Tag {
    private String name;
    private Color color;

    public Tag(String name) {
        this.name = name;
        this.color = Color.NONE;
        System.out.println("Keine Farbe ausgewählt!");
    }

    public Tag(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
