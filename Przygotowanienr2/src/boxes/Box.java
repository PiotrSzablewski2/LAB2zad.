package boxes;
public class Box {
    private int pojemonsc;
    private int pojemnoscMax = 100;
    private String produkt;
    public Box (int pojemonsc, String produkt) {
        this.pojemonsc = pojemonsc;
        this.produkt = produkt;
    }
    public int getPojemonsc() {
        return pojemonsc;
    }

    public void setPojemonsc(int pojemonsc) {
        this.pojemonsc = pojemonsc;
    }

    public int getPojemnoscMax() {
        return pojemnoscMax;
    }

    public void setPojemnoscMax(int pojemnoscMax) {
        this.pojemnoscMax = pojemnoscMax;
    }

    public String getProdukt() {
        return produkt;
    }

    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }
    public int getzmiana(int stan) {
        pojemonsc += stan;

        if (pojemonsc > pojemnoscMax) {System.out.println("nie można włożyć tyle " + produkt + " do boxa");
                return pojemonsc -= stan;
        }
        else if(pojemonsc < 0) {System.out.println("nie można wyjąć tyle " + produkt + " z boxa") ;
        return pojemonsc -= stan; }
        else return pojemonsc;

    }
    @Override
    public String toString() {
        return "Box{" +
                "pojemonsc=" + pojemonsc +
                ", produkt='" + produkt + '\'' +
                '}';
    }
}
