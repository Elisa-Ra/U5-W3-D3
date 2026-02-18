package elisaraeli.U5_W3_D3.chain;

public class Main {
    public static void main(String[] args) {

        Ufficiale tenente = new Tenente();
        Ufficiale capitano = new Capitano();
        Ufficiale maggiore = new Maggiore();
        Ufficiale colonnello = new Colonnello();
        Ufficiale generale = new Generale();

        tenente.setUfficialeSuperiore(capitano);
        capitano.setUfficialeSuperiore(maggiore);
        maggiore.setUfficialeSuperiore(colonnello);
        colonnello.setUfficialeSuperiore(generale);


        tenente.next(3500);
        tenente.next(2500);
        tenente.next(1000);
        tenente.next(4000);
        tenente.next(6000);
    }
}

