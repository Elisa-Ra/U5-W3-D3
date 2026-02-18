package elisaraeli.U5_W3_D3.adapter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

// immplementa DataSource quindi diventa compatibile con UserData
public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate nascita = info.getDataDiNascita()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        return Period.between(nascita, LocalDate.now()).getYears();

    }
}
