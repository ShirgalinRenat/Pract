package ru.company.project.staff;


public abstract class Staff implements Factory {

    private int id;

    public Staff() {

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    private StaffGenerator obtainer;

    public abstract Staff create() throws IllegalAccessException;

    public StaffGenerator getObtainer(){
        return obtainer;
    }

    public Staff(StaffGenerator obtainer){
        this.obtainer = obtainer;
    }
}
