import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class stringManipulation {
    public static void main(String[] args) throws Exception {

        String name = "Davi Gomes";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("PT", "BR");
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        System.out.println(diaDaSemana);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia!!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        } else {
            saudacao = "Olá";
        }

        System.out.printf("Olá %s hoje é %s, %s.%n", name, diaDaSemana, saudacao.toUpperCase());

    }
}
