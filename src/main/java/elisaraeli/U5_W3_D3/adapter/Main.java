package elisaraeli.U5_W3_D3.adapter;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Info info = new Info();
        info.setNome("Elisa");
        info.setCognome("Raeli");
        LocalDate ld = LocalDate.of(1997, 1, 1);
        Date data = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
        info.DataDiNascita(data);


        DataSource ds = new InfoAdapter(info);

        UserData user = new UserData();
        user.getData(ds);

        System.out.println(user);
    }
}
