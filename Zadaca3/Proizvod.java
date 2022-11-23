public class Proizvod {
    private String ime, proizvoditel;
    private int cena;
    private double tezina;

    public Proizvod() {
        this.ime = "Smoki";
        this.proizvoditel = "Smokic";
        this.cena = 50;
        this.tezina = 500;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }
}
