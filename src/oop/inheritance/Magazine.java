package oop.inheritance;

public abstract class Magazine extends Publication {
    private Integer orderQTY;
    @Override
    public String ToString() {
        return null;
    }
    public void adjustQTY(Integer orderQTY) {

    }
    public abstract void recvNewIssue(String issue);
}
