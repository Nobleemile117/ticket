package oop.inheritance;

public abstract class Publication implements ISaleableItem {
    private String title;
    private float price;
    private Integer copies;
    @Override
    public float Price() {
        return 0;
    }

    @Override
    public void SellCopy() {

    }
    public abstract String ToString();
}
