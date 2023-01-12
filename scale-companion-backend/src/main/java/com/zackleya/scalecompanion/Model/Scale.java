package com.zackleya.scalecompanion.Model;

public class Scale {

    private int id;
    private String root;
    private String type;
    private char[] notes;
    private String diagram;
    private String description;

    public Scale() {}
    public Scale(int id, String root, String type, char[] notes, String diagram, String description) {
        this.id = id;
        this.root = root;
        this.type = type;
        this.notes = notes;
        this.diagram = diagram;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getRoot() {
        return root;
    }

    public String getType() {
        return type;
    }

    public char[] getNotes() {
        return notes;
    }

    public String getDiagram() {
        return diagram;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNotes(char[] notes) {
        this.notes = notes;
    }

    public void setDiagram(String diagram) {
        this.diagram = diagram;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
