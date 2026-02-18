package elisaraeli.U5_W3_D3.chain;

import lombok.Setter;

@Setter
public abstract class Ufficiale {
    private Ufficiale ufficialeSuperiore;

    public void setUfficiale(Ufficiale ufficialeSuperiore) {
        this.ufficialeSuperiore = ufficialeSuperiore;
    }

    public abstract int getStipendio();

    public abstract String getCarica();

    public void next(int cifra) {
        if (getStipendio() >= cifra) {
            System.out.println(getCarica() + " riceve uno stipendio di " + getStipendio() + " quindi rientra nei " + cifra);
        } else if (ufficialeSuperiore != null) {
            ufficialeSuperiore.next(cifra);
        } else {
            System.out.println("La catena è terminata. Non ci sono ufficiali che ricevo uno stipendio di almeno " + cifra);
        }

    }
}
