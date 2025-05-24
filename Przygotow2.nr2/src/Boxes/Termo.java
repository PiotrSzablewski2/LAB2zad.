package Boxes;

public class Termo extends Box {
    private Integer temperatur;
    public Termo (int pojemonsc, String produkt , int temperatur) {
        super(pojemonsc, produkt);
        this.temperatur = temperatur;
    }

    public int getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
    }

    @Override
    public String toString() {
        if(getPojemonsc() != 0) {
            return "Termo{" + " pojemnosc =" + getPojemonsc() +
                    ", produkt = " + getProdukt() +
                    ", temperatur= '" + temperatur + '\'' +
                    '}';
        }
        else {
            return "Termo{" + " pojemnosc =" + getPojemonsc() +
                    ", produkt = " + getProdukt() +
                    ", temperatur =' nie można odczytać temperatury '\'" +
                    '}';

        }
    }
}
