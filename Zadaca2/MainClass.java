public class MainClass {

    public static void main(String[] args){

        Restoran restoran = new Restoran();
        restoran.setIme("Petar");
        restoran.setLokacija("Bojkovski");
        restoran.setTelefonskiBroj(5648796);
        restoran.setBrojNaSedista(78);

        System.out.println("Ime: " + restoran.getIme() +
                "\nLokacija: " + restoran.getLokacija() +
                "\nTelefonski broj: 07" + restoran.getTelefonskiBroj() +
                "\nBroj na sedista: " + restoran.getBrojNaSedista());
    }
}