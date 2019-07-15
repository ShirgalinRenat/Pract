package ru.company.project.model.staff;


public abstract class Staff {

    private int id;

    public String debug;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

}
