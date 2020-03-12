package oop.inheritance;

public abstract class Book extends Publication {
    private String author;
    @Override
    public String ToString() {
        return null;
    }
    public abstract void OrderCopies(Integer copies);
}
