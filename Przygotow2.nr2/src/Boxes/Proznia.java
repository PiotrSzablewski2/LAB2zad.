package Boxes;

public class Proznia  extends Box {
    private boolean open ;
    public Proznia (int pojemonsc, String produkt) {
        super(pojemonsc, produkt);
        this.open = false;
    }
    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {

        this.open = open;
    }
    public boolean zapieczentowanie (String jujutsu ){
        if ( "T" .equals(jujutsu)){
            this.open = true;
        } else {
            this.open = false;
        }
        return this.open;
    }
    public int getzmiana (int stan) {
      if (open == true) return getPojemonsc();
      return super.getzmiana(stan);
         }
    @Override
    public String toString() {
        return "Proznia{" +
                "pojemnosc=" + getPojemonsc() +
                ", produkt='" + getProdukt() + '\'' +
                ", zapieczentowane =" + open +
                '}';
    }

}
