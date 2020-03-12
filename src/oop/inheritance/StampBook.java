package oop.inheritance;

public class StampBook implements ISaleableItem {
    private Integer qty;
    private Integer value;
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
