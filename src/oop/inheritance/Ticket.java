package oop.inheritance;

public class Ticket implements ISaleableItem{
    private String Description;
    private float price;
    private String client;

    @Override
    public float Price() {
        return 0;
    }

    @Override
    public void SellCopy() {

    }
    public String ToString(){
        return null;
    }
}
