package Aula11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DataHora {
    public static void main(String[] args) {
        // Para imprimir a hora neste exato momento (Imprime a data do seu OS no console)
        LocalDate d01 = LocalDate.now();
        System.out.println("d01: "+ d01);

        // Segue o mesmo princípio do LocalDate, a diferença é que ele mostra a hora, os minutos, os segundos e os milissegundos
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("d02: "+ d02);

        // Para indicar o timezone de Londres
        Instant d03 = Instant.now();
        System.out.println("d03: "+ d03);

        // Para definir o padrão de data que você quer
        LocalDate d04 = LocalDate.parse("2023-08-08");
        System.out.println("d04: "+ d04);

        // Para definir o padrão de data-hora que você quer
        LocalDateTime d05 = LocalDateTime.parse("2023-08-08T00:00:00");
        System.out.println("d05: "+ d05);

        // Para definir o padrão de data-hora local que você quer
        Instant d06 = Instant.parse("2023-08-08T00:00:00Z");
        System.out.println("d06: "+ d06);

        // Para definir o padrão de data-hora global que você quer
        Instant d07 = Instant.parse("2023-08-08T00:00:00-03:00");
        System.out.println("d07: "+ d07);

        // Textos formatados customizados

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("10/08/2023", fmt01);
        System.out.println("d08: "+ d08);

        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("10/08/2023 01:30", fmt02);
        System.out.println("d09: "+ d09);

        LocalDate d10 = LocalDate.of(2023, 8, 10);
        System.out.println("d10: "+ d10);

        LocalDateTime d11 = LocalDateTime.of(2023, 8, 10, 13,50,30);
        System.out.println("d11: "+ d11);

        // Convertendo data-hora para texto

        DateTimeFormatter fmt04 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("d12: "+ d04.format(fmt04));
        // Forma alternativa: System.out.println("d12: "+ fmt04.format(d04));
        // Forma alternativa 2: System.out.println("d12: "+ fmt04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        DateTimeFormatter fmt05 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("d13: "+ d05.format(fmt05));

        DateTimeFormatter fmt06 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d14: "+ fmt06.format(d06));

        DateTimeFormatter fmt07 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("d15: "+ fmt07.format(d05));

        DateTimeFormatter fmt08 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("d16: "+ fmt08.format(d06));

        // Converter data-hora global para local
        for (String s: ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("r1: " + r1);

        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r2: " + r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("r3: " + r3);

        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r4: " + r4);

        // Obter dados de uma data-hora local
        System.out.println("d04 dia: "+d04.getDayOfMonth());

        System.out.println("d04 mês: "+d04.getMonthValue());

        System.out.println("d04 ano: "+d04.getYear());

        System.out.println("d05 hora: "+d05.getHour());

        System.out.println("d05 minuto: "+d05.getMinute());

        // Cálculos com data-hora
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        System.out.println(pastWeekLocalDate);

        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println(nextWeekLocalDate);

        LocalDate nextYearLocalDate = d04.plusYears(7);
        System.out.println(nextYearLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        System.out.println(pastWeekLocalDateTime);

        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println(nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        System.out.println(pastWeekInstant);

        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println(nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d05 );
        System.out.println(t1.toDays());

        Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
        System.out.println(t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, d03);
        System.out.println(t3.toDays());

        Duration t4 = Duration.between(d03, pastWeekInstant);
        System.out.println(t4.toDays());

    }
}
