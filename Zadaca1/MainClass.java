public class MainClass {

    public static void main(String[] args){

        Covek covek = new Covek();
        covek.setIme("Petar");
        covek.setPrezime("Bojkovski");
        covek.setMaticen(1234567891011B);

        System.out.println("Ime: " + covek.ime +
                "\nPrezime: " + covek.prezime +
                "\nMaticen: " + covek.maticen);
    }
}